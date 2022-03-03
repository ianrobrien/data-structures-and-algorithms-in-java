package no.obrien.dsaa.datastructures.collections;

public interface Collection<T extends Comparable<T>> {

  void add(T item);

  void remove(T item);

  int size();

  void clear();

  boolean contains(T item);

  default boolean isEmpty() {
    return this.size() == 0;
  }

  default boolean isNotEmpty() {
    return !this.isEmpty();
  }
}
