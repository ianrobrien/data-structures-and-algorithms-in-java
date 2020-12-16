package no.obrien.dsaa.datastructures.collections.lists;

import no.obrien.dsaa.datastructures.collections.Collection;

public class LinkedList<T> implements Collection<T> {

  private int size;
  private ListNode<T> head;

  @Override
  public void add(T item) {
    if (this.head == null) {
      this.head = new ListNode<>(item);
    } else {
      ListNode<T> tail = this.head;
      while (tail.getNext() != null) {
        tail = tail.getNext();
      }
      tail.setNext(new ListNode<>(item));
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
    ListNode<T> current = this.head;
    while (current != null) {
      if (current.getValue() == item) {
        return true;
      }
      current = current.getNext();
    }

    return false;
  }

  static class ListNode<T> {

    private final T value;
    private ListNode<T> next;

    public ListNode(T value) {
      this.value = value;
    }

    public T getValue() {
      return this.value;
    }

    public ListNode<T> getNext() {
      return this.next;
    }

    public void setNext(ListNode<T> listNode) {
      this.next = listNode;
    }
  }
}
