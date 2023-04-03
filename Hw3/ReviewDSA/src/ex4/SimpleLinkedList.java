package ex4;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void printNode() {
        /*Node curr = top;

        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.next;
        }
         */
        Node curr = top;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void add(T data) {
        /*
        Node curr = new Node();
        curr.data = data;
        curr.next = null;

        if (top == null && bot == null) {
            top = bot = curr;
        } else {
            curr.next = top;
            top = curr;
        }
        n++;
         */
        Node curr = new Node();
        curr.data = data;
        curr.next = null;

        if (top == null && )
    }

    public void addBot(T data) {
        /*
        Node curr = new Node();
        curr.data = data;
        curr.next = null;

        if (top == null && bot == null) {
            top = bot = curr;
        } else {
            bot.next = curr;
            bot = curr;
        }
        n++;
         */
    }

    public T get(int i) {
        /*
        if (i < 0 || i >= n) {
            return null;
        }
        int count = 0;
        Node curr = top;
        if (i == 0) {
            return top.data;
        }
        while (count < i - 1) {
            curr = curr.next;
            count++;
        }
        return curr.data;
         */
    }

    public void set(int i, T data) {
        /*
        Node curr = top;
        for (int j = 0; j < i; j++) {
            curr.next = curr;
        }
        curr.data = data;
         */
    }

    public boolean isContain(T data) {
        /*
        Node curr = top;
        while (curr != null) {
            if (curr.data.equals(data)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
         */
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return top == null && bot == null;
    }

    public T removeTop() {
        /*
        if (top == null && bot == null) {
            return null;
        }
        Node curr = top;
        top = curr.next;
        n--;
        return curr.data;
         */
    }

    public T removeBot() {
        /*
        if (top == null && bot == null) {
            return null;
        }
        if (top.next == null) {
            return null;
        }
        Node curr = top;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;

        return top.data;
         */

    }

    public void remove(T data) {
        /*
        Node curr = top;
        Node prev = null;

        if (n == 0) {
            return;
        }
        while (curr != null) {
            if (curr.data.equals(data)) { //so sánh với value data đầu vào
                n--; //giảm số phần tử đi
                if (prev == null) {
                    top = curr.next;
                } else {
                    prev.next = curr.next;
                }
            }

            if (curr.next != this.top) {
                prev = curr; //gán prev thành curr sau đó gán curr thành phần tử sau đó
            }
            curr = curr.next;

        }
         */
    }
}
