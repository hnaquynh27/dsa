package ex4;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        SimpleLinkedList newList = new SimpleLinkedList();
        System.out.println(newList.isEmpty());

        newList.add(10);
        newList.add(50);
        newList.add(55);
        newList.add(67);
        newList.add(52);
        newList.add(23);
        newList.printNode();
        System.out.println();

        newList.addBot(52);
        newList.addBot(11);
        newList.printNode();
        System.out.println();

        System.out.println(newList.get(3));

        System.out.println(newList.isContain(12));
        System.out.println(newList.isContain(11));

        System.out.println(newList.isEmpty());

        newList.removeBot();
        newList.printNode();

        System.out.println();
        newList.removeTop();
        newList.printNode();

        System.out.println();
        newList.remove(52);
        newList.printNode();
    }
}
