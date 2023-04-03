package ex2;

import ex1.LinkedListStack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements QueueInterface<E> {

    class Node {
        E val;
        Node next;

        public Node() {
        }

        public E getVal() {
            return val;
        }

        public void setVal(E val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node top = null, behind = null;
    private int size;

    public void printNode() {
        Node curr = top;

        while (curr != null) {
            System.out.print(curr.getVal() + " ");
            curr = curr.next;
        }
    }
    @Override
    public void enqueue(E elem) {
        Node temp = new Node();
        temp.setVal(elem);
        if (top == null && behind == null) {
            top = temp;
            behind = temp;
        }
        behind.next = temp;
        behind = temp;
        size++;
    }

    @Override
    public E dequeue() {
        Node temp = top;
        if (top == null) {
            return null;
        } else {
            top = top.next;
            size--;
            return temp.val;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    class LinkedListIterator implements Iterator<E> {
        private Node curr;
        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E item = curr.getVal();
            curr = curr.next;
            return item;
        }
    }
}
