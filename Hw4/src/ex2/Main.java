package ex2;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> arr = new ArrayQueue<>();
        arr.enqueue(9);
        arr.enqueue(23);
        arr.enqueue(43);
        arr.enqueue(45);
        arr.enqueue(95);
        arr.enqueue(55);

        System.out.println("Queue elements: ");
        arr.show();
        System.out.println();

        arr.dequeue();
        arr.show();
        System.out.println();
    }
}
