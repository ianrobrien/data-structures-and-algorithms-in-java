package no.obrien.dsaa.datastructures.collections.stacks;

import no.obrien.dsaa.datastructures.collections.lists.LinkedList;

public class LinkedListStack<T extends Comparable<T>> implements Stack<T> {

  private final LinkedList<T> linkedList = new LinkedList<>();

  @Override
  public void add(T item) {
    this.linkedList.add(item);
  }

  @Override
  public void remove(T item) {
    this.linkedList.remove(item);
  }

  @Override
  public int size() {
    return this.linkedList.size();
  }

  @Override
  public void clear() {
    this.linkedList.clear();
  }

  @Override
  public boolean contains(T item) {
    return this.linkedList.contains(item);
  }

  @Override
  public void push(T item) {
    this.linkedList.add(item);
  }

  @Override
  public T pop() {
    T item = this.linkedList.get(this.size() - 1);
    this.linkedList.remove(item);
    return item;
  }

  @Override
  public T peek() {
    return this.linkedList.get(this.size() - 1);
  }
}
