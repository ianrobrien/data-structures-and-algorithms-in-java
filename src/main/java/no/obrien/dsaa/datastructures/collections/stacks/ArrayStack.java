package no.obrien.dsaa.datastructures.collections.stacks;

import java.util.Arrays;

public class ArrayStack<T extends Comparable<T>> implements Stack<T> {

  private static final int DEFAULT_SIZE = 128;

  private int head = -1;
  private int size;
  private int maxSize;

  private Object[] elements;

  public ArrayStack() {
    this(DEFAULT_SIZE);
  }

  public ArrayStack(int size) {
    if (size < 0) {
      throw new IllegalArgumentException();
    }
    this.elements = new Object[size];
    this.maxSize = size;
  }

  @Override
  public void add(T item) {
    this.checkArraySizeAndGrow();
    this.elements[++this.head] = item;
    this.size++;
  }

  @Override
  public void remove(T item) {
    for (int i = 0; i < this.head; i++) {
      if (elements[i].equals(item)) {
        this.elements[i] = null;
        for (int j = i; j < this.head; j++) {
          this.elements[j] = this.elements[j + 1];
        }
        this.elements[this.head] = null;
        this.head--;
        this.size--;
        break;
      }
    }
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public void clear() {
    for (int i = 0; i < this.head; i++) {
      this.elements[i] = null;
    }
    this.head = -1;
    this.size = 0;
  }

  @Override
  public boolean contains(T item) {
    for (int i = 0; i < this.head; i++) {
      if (this.elements[i].equals(item)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void push(T item) {
    this.add(item);
  }

  @Override
  public T pop() {
    var element = (T) elements[this.head];
    elements[this.head] = null;
    this.head--;
    this.size--;
    return element;
  }

  @Override
  public T peek() {
    checkArrayIndex(this.head);
    return (T) this.elements[this.head];
  }

  private void checkArrayIndex(int i) {
    if (i < 0 || i >= this.head + 1) {
      throw new IndexOutOfBoundsException();
    }
  }

  private void checkArraySizeAndGrow() {
    if (this.size() == this.maxSize) {
      this.maxSize *= 2;
      this.elements = Arrays.copyOf(this.elements, this.maxSize);
    }
  }
}
