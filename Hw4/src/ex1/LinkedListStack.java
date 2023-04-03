package ex1;

import java.util.*;

public class LinkedListStack<E> implements StackInterface<E> {
    class Node {
        E elem;
        Node next;

        public Node() {
        }

        public E getElem() {
            return elem;
        }

        public void setElem(E elem) {
            this.elem = elem;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node stack;
    int length;

    public LinkedListStack() {
        stack = null;
    }

    public void printNode() {
        Node curr = stack;

        while (curr != null) {
            System.out.print(curr.getElem() + " ");
            curr = curr.next;
        }
    }

    @Override
    public void push(E elem) {
        Node temp = new Node();
        temp.setElem(elem);
        temp.next = stack;
        stack = temp;
        length++;
    }

    @Override
    public E pop() {
        if (stack == null) {
            return null;
        }
        Node temp = stack;
        stack = stack.next;
        length--;
        return temp.getElem();
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public E top() {
        return stack.getElem();
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }


    class StackIterator implements Iterator<E> {
        private Node currNode = stack;

        public boolean hasNext() {
            return currNode != null;
        }

        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E data = currNode.elem;
            currNode = currNode.next;
            return data;
        }
    }
}
