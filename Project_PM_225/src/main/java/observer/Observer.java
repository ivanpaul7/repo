package observer;

public interface Observer<E> {
    void notifyEvent(ListEvent<E> event);
}
