package no.obrien.dsaa.algorithms.sort;

public class MergeSort<T extends Comparable<T>> implements Sorter<T> {

  @Override
  public T[] sort(T[] elements) {
    sort(elements, elements.length);
    return elements;
  }

  void merge(T[] elements, T[] left, T[] right, int beginning, int end) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < beginning && j < end) {
      if (left[i].compareTo(right[j]) <= 0) {
        elements[k++] = elements[i++];
      } else {
        elements[k++] = right[j++];
      }
    }
    while (i < beginning) {
      elements[k++] = left[i++];
    }
    while (j < end) {
      elements[k++] = right[j++];
    }
  }

  void sort(T[] elements, int end) {
    if (end < 2) {
      return;
    }
    int middle = end / 2;

    Comparable<T>[] left = new Comparable[middle];
    Comparable<T>[] right = new Comparable[end - middle];

    for (int i = 0; i < middle; i++) {
      left[i] = elements[i];
    }

    for (int i = middle; i < end; i++) {
      right[i - middle] = elements[i];
    }

    sort((T[]) left, middle);
    sort((T[]) right, end - middle);

    merge(elements, (T[]) left, (T[]) right, middle, end - middle);
  }
}
