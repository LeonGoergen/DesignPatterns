package behavioral.iterator;

// Iterator
public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
