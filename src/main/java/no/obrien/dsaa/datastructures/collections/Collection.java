package no.obrien.dsaa.datastructures.collections;

public interface Collection<T> {

  void add (T item);

  void remove (T item);

  int size();

  void clear();

  boolean contains(T item);

}
