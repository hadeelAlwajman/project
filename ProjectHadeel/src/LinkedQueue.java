/**
 * Created by USER on 01/04/2021.
 */
public class LinkedQueue<E>implements Queue<E> {
CircularLinkedList<E>list=new CircularLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.First();
    }
    @Override
    public void enqueue(E element) {
    list.addLast(element);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
}
