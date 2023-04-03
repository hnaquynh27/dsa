package ex3;

import ex1.StackArray;

public class BracketMatching {

    static boolean areMatching(String str) {

        StackArray<Character> stack = new StackArray<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } else if (x == ')') {
                if (stack.isEmpty() || stack.top() != '(') {
                    return false;
                }
                stack.pop();
            } else if (x == ']') {
                if (stack.isEmpty() || stack.top() != '[') {
                    return false;
                }
                stack.pop();
            } else if (x == '}') {
                if (stack.isEmpty() || stack.top() != '{') {
                    return false;
                }
                stack.pop();
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String str = "[(4 + 8 * 9 + 8) * 2 - (4 + 5) * 8] - 4";
        if(areMatching(str)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}

