package ex2;

import java.util.Iterator;

public class ArrayQueue<E> implements QueueInterface<E> {
    private E[] queue;
    private int n = 0; //số lượng phần tử hiện có trong mảng
    private int top = 0; //chỉ số phần tử đầu tiên
    private int count = 0; //chỉ số phần phía sau
    private int defaultSize = 100;

    public ArrayQueue(int capacity) {
        n = capacity;
        queue = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        n = defaultSize;
        queue = (E[]) new Object[defaultSize];
    }


    @Override
    public void enqueue(E elem) throws IllegalStateException{

        if (count == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        if (count < queue.length) {
            int idx = (top + count) % queue.length;
            queue[idx] = elem;
            count++;
        }
    }

    @Override
    public E dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty, can't be deleted");
        }
        E temp = queue[top];
        queue[top] = null;
        top = (top + 1) % queue.length;
        count--;
        return temp;
    }

    public E first(){
        if (isEmpty()) {
            return null;
        }
        return queue[top];
    }
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    public void show() {
        for (int i = top; i < count; i++) {
            System.out.printf("%d ", queue[i]);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorArr();
    }

    class IteratorArr implements Iterator<E> {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < n;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                System.out.println("Doesn't have next");
            }
            E temp = queue[(i + top) % queue.length];
            i++;
            return temp;
        }
    }
}
