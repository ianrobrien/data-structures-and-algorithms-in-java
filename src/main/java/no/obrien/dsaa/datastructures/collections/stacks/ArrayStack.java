package no.obrien.dsaa.datastructures.collections.stacks;

public class ArrayStack<T extends Comparable<T>> implements Stack<T> {

  private static final int DEFAULT_SIZE = 128;

  private int size;

  public ArrayStack() {
    this(DEFAULT_SIZE);
  }

  public ArrayStack(int defaultSize) {
  }

  @Override
  public void add(T item) {
    this.size++;
  }

  @Override
  public void remove(T item) {
    this.size--;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public void clear() {
    while (!this.isEmpty()) {
      this.pop();
    }
  }

  @Override
  public boolean contains(T item) {
    return false;
  }

  @Override
  public void push(T item) {
    this.add(item);
  }

  @Override
  public T pop() {
    return null;
  }

  @Override
  public T peek() {
    return null;
  }
}
