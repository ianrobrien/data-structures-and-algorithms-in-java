package no.obrien.dsaa.datastructures.collections.lists;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class LinkedList<T extends Comparable<T>> implements List<T> {

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
    if (this.head != null) {
      if (this.head.getValue() == item) {
        ListNode<T> temp = this.head;
        this.head = this.head.getNext();
        temp.setNext(null); // prevent memory leak by removing reference to next node
        this.size--;
      } else {
        ListNode<T> previous = this.head;
        ListNode<T> current = this.head.getNext();
        while (current != null) {
          if (current.getValue() == item) {
            previous.setNext(current.getNext());
            current.setNext(null); // prevent memory leak by removing reference to next node
            this.size--;
            return;
          } else {
            previous = current;
            current = current.getNext();
          }
        }
      }
    }
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public void clear() {
    if (this.head != null) {
      ListNode<T> previous = this.head;
      ListNode<T> current = this.head.getNext();
      while (current != null) {
        previous.setNext(null);
        previous = current;
        current = current.getNext();
        this.size--;
      }
      this.head = null;
      this.size--;
    }
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

  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  @Override
  public T get(int index) {
    if (index < 0 || index > this.size - 1) {
      throw new IndexOutOfBoundsException();
    }
    ListNode<T> current = this.head;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }
    return current.getValue();
  }

  @Data
  @RequiredArgsConstructor
  static class ListNode<T extends Comparable<T>> {

    private final T value;
    private ListNode<T> next;
  }
}
