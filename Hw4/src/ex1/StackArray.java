package ex1;

import java.util.*;

public class StackArray<E> implements StackInterface<E> {
    private int capacity = 1;
    private E[] arr;
    private int count = -1;

    public StackArray() {
        arr = (E[]) new Object[capacity];
    }

    public StackArray(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    public void push(E elem) {
        if (isFull()) {
            ensureCapacity();
        }
        count++;
        arr[count] = elem;
    }

    private void ensureCapacity() {
        E[] temp = (E[]) new Object[capacity];
        for (int i = 0; i < count + 1; i++)
            temp[i] = arr[i];
        capacity = capacity * 2;
        arr = (E[]) new Object[capacity];
        for (int i = 0; i < count + 1; i++)
            arr[i] = temp[i];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < count + 1; i++) {
            sb.append(arr[i].toString());
            if (i < count) {
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }

        E temp = arr[count];
        arr[count] = null;
        count--;
        return temp;
    }

    public boolean isEmpty() {
        return (count == -1);
    }

    public boolean isFull() {
        return count == capacity - 1;
    }

    public E top() {
        if (isEmpty()) {
            return null;
        } else {
            return arr[count];
        }
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private int first = -1;
            @Override
            public boolean hasNext() {
                if(first < count){
                    return true;
                }
                return false;
            }

            @Override
            public E next() {
                return arr[first++];
            }
        };
        return iterator;
    }
}
