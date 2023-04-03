package ex1;

public class Main {
    public static void main(String[] args) {
        StackArray<Integer> arrStack = new StackArray<Integer>();
        arrStack.push(11);
        arrStack.push(12);
        arrStack.push(31);
        arrStack.push(15);
        arrStack.push(10);

        System.out.println(arrStack.toString());

        System.out.println(arrStack.top());
        arrStack.pop();
        System.out.println(arrStack.top());

    }
}
