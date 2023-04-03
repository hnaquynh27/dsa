package ex2;

public class Test {
    public static void main(String[] args) {
        LinkedListQueue<Integer> list = new LinkedListQueue<>();
        list.enqueue(5);
        list.enqueue(6);
        list.enqueue(53);
        list.enqueue(15);
        list.enqueue(54);
        list.enqueue(50);
        list.enqueue(23);
        list.enqueue(28);

        list.printNode();
        System.out.println();
        list.dequeue();
        list.dequeue();
        list.printNode();
    }
}
