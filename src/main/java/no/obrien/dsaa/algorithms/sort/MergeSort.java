package no.obrien.dsaa.algorithms.sort;

public class MergeSort<T extends Comparable<T>> implements Sorter<T> {

  @Override
  public T[] sort(T[] elements) {
    sort(elements, 0, elements.length - 1);
    return elements;
  }

  void merge(T[] elements, int left, int middle, int right) {
    int sizeFirst = middle - left + 1;
    int sizeSecond = right - middle;
  }

  void sort(T[] elements, int left, int right) {
    if (left < right) {
      int middle = 1 + (right - 1) / 2;
      sort(elements, left, middle);
      sort(elements, middle + 1, right);

      merge(elements, left, middle, right);
    }
  }
}
