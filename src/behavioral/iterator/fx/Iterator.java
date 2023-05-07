package behavioral.iterator.fx;

// Iterator
public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
