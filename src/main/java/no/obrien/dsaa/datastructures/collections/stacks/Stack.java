package no.obrien.dsaa.datastructures.collections.stacks;


import no.obrien.dsaa.datastructures.collections.Collection;

public interface Stack<T extends Comparable<T>> extends Collection<T> {

  void push(T item);

  T pop();

  T peek();
}
