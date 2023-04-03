package ex1;

public class Test {
    public static void main(String[] args) {
        LinkedListStack<Integer> listStack = new LinkedListStack<>();
        listStack.push(8);
        listStack.push(0);
        listStack.push(11);
        listStack.push(22);
        listStack.push(43);
        listStack.push(78);
        listStack.push(27);

        listStack.printNode();
        System.out.println();

        listStack.pop();
        listStack.pop();
        listStack.printNode();
        System.out.println();
        System.out.println(listStack.top());
    }
}
