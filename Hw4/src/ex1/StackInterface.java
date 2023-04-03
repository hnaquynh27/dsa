package ex1;

public interface StackInterface<E> extends Iterable<E> {
    public void push(E elem);
    public E pop();
    public boolean isEmpty();
    public E top();
}
