package ex2;

public interface QueueInterface<E> extends Iterable<E>{
    public void enqueue(E elem);
    public E dequeue();
    public boolean isEmpty();
}

