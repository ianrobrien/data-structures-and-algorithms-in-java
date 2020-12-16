package no.obrien.dsaa.datastructures.collections.lists;

import no.obrien.dsaa.datastructures.collections.Collection;

public class LinkedList<T> implements Collection<T> {

  private int size;
  private LinkedListNode<T> head;

  @Override
  public void add(T item) {
    if (this.head == null) {
      this.head = new LinkedListNode<>(item);
    } else {
      LinkedListNode<T> tail = this.head;
      while (tail.getNext() != null) {
        tail = tail.getNext();
      }
      tail.setNext(new LinkedListNode<>(item));
    }
    this.size++;

  }

  @Override
  public void remove(T item) {
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public void clear() {
  }

  @Override
  public boolean contains(T item) {
    LinkedListNode<T> current = this.head;
    while (current != null) {
      if (current.getValue() == item) {
        return true;
      }
      current = current.getNext();
    }

    return false;
  }

  static class LinkedListNode<T> {

    private final T value;
    private LinkedListNode<T> next;

    public LinkedListNode(T value) {
      this.value = value;
    }

    public T getValue() {
      return this.value;
    }

    public LinkedListNode<T> getNext() {
      return this.next;
    }

    public void setNext(LinkedListNode<T> linkedListNode) {
      this.next = linkedListNode;
    }
  }
}
