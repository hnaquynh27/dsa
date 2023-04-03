package ex3;

import java.util.*;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] arr;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        arr = (T[]) new Object[n];
    }

    public SimpleArrayList(int capacity) {
        arr = (T[]) new Object[capacity];
    }

    public T get(int i) {
        if (i < 0 || i >= n) {
            return null;
        }
        return arr[i - 1];
    }

    public void printArray() {
        StringBuilder arrayString = new StringBuilder();
        for (T elem : arr) {
            arrayString.append(elem).append(" ");
        }
        System.out.print(arrayString.toString().trim());
    }

    private void allocateMore() {
        T[] newArray = (T[]) new Object[10 + this.n];
        System.arraycopy(this.arr, 0, newArray, 0, this.arr.length);
        this.arr = newArray;
    }

    public void add(T data) {
        if (this.n >= this.arr.length) {
            allocateMore();
        }
        arr[n] = data;
        n++;
    }

    public void set(int i, T data) {
        if (i < 0 || i >= n) {
            return;
        }
        arr[i - 1] = data;
    }

    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(data)) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = null;
                n--;
            }
        }
    }

    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> result = new Iterator<T>() {
            private int currentIdx = 0;

            @Override
            public boolean hasNext() {
                return currentIdx < n && arr[currentIdx] != null;
            }

            @Override
            public T next() {
                return arr[currentIdx++];
            }
        };
        return result;
    }
}
