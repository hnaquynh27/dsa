package ex3;

import java.util.Stack;

public class Evalute {
    public static void main(String[] args) {
        String ex1 = "(a + b) * (c – d)";
        String ex2 = "(10 – 8) / ( (2 + 5) * 17)";
        String ex3 = "(a + b) * c – d)";
        String ex4 = "(10 – 8 / ( (2 + 5) * 17)";
        String ex5 = ") u – v) * (m + n)";
        System.out.println(ex1 + ": " + isValidExp(ex1));
        System.out.println(ex2 + ": " + isValidExp(ex2));
        System.out.println(ex3 + ": " + isValidExp(ex3));
        System.out.println(ex4 + ": " + isValidExp(ex4));
        System.out.println(ex5 + ": " + isValidExp(ex5));

        String ex6 = "[(6 + 9) * 3] - 8";
        String ex7 = "((50 - ((8 - 4) * (2 + 3))) + (3 * 4))";

        if (isValidExp(ex6)) {
            System.out.println(ex6 + " = " + evaluate(ex6));
        }
        if (isValidExp(ex7)) {
            System.out.println(ex7 + " = " + evaluate(ex7));
        }
    }

    public static boolean isValidExp(String expression) {
        if (expression == null) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char temp = expression.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            }
            if (temp == ')' || temp == ']' || temp == '}') {
                if (temp == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (temp == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (temp == '}') {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static int evaluate(String infix) {
        /*
        stack value dùng để lưu giá trị của các toán hạng
         */
        Stack<Integer> value = new Stack<>();


        Stack<Character> operator = new Stack<>();// operator dùng lưu toán tử và dấu ngoặc mở

        for (int i = 0; i < infix.length(); i++) {
            char temp = infix.charAt(i);

            if (temp == ' ') {
                continue;
            }

            // nếu là toán hạng thì push vào value
            if (Character.isDigit(temp)) {
                StringBuilder sb = new StringBuilder();
                sb.append(temp);
                while (i + 1 < infix.length() && Character.isDigit(infix.charAt(i + 1))) {
                    sb.append(infix.charAt(i + 1));
                    i++;
                }
                value.push(Integer.parseInt(sb.toString()));
                continue;
            }

            //nếu là dấu mở ngoặc thì push vào stack operator
            if (temp == '(') {
                operator.push(temp);
                continue;
            }

            //nếu là dấu đóng ngoặc
            if (temp == ')') {
                while (operator.peek() != '(' && !operator.isEmpty()) {
                    //khi phần tử top của stack toán tử khác dấu mở ngoặc và stack operator không trống
                    // thực hiện phép toán giữa value.pop và value.pop
                    // push kết quả vừa thực hiện vào stack value
                    int b = value.pop();
                    int a = value.pop();
                    value.push(result(operator.pop(), a, b));
                }
                operator.pop(); //pop dấu mở ngoặc tương ứng ra khỏi stack toán tử operator
                continue;
            }

            if (isOperator(temp)) { //nếu là toán tử
                while (!operator.isEmpty() && precedence(temp) <= precedence(operator.peek())) {
                    //khi stack operator không trống, và khi độ ưu tiên của toán tử đang xét nhỏ hơn hoặc bằng độ ưu tiên của operator.peek
                    //thì thực hiện phép toán, và push kết quả vào value
                    int b = value.pop();
                    int a = value.pop();
                    value.push(result(operator.pop(), a, b));
                }
                operator.push(temp); //push toán tử đang xét vào stack operator
            }

        }

        while (!operator.isEmpty()) {
            //khi stack operator không trống, thực hiện phép toán tiếp tục
            int b = value.pop();
            int a = value.pop();
            value.push(result(operator.pop(), a, b));
        }
        return value.pop(); // trả về phần tử đầu tiên trong stack
    }

    public static int result(char operator, int a, int b) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
            }
            case '^' -> {
                return (int) Math.pow(a, b);
            }
        }
        return 0;
    }

    public static int precedence(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

}
