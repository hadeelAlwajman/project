/**
 * Created by USER on 01/04/2021.
 */
public interface Queue<E> {
    public boolean isEmpty();
    public int size();
    public E first();
    public void enqueue(E element);
    public E dequeue();
}
