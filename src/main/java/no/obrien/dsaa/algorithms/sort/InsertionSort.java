package no.obrien.dsaa.algorithms.sort;

import no.obrien.dsaa.utilities.ArrayUtils;

public class InsertionSort<T extends Comparable<T>> implements Sorter<T> {

  @Override
  public T[] sort(T[] elements) {
    for (int i = 0; i < elements.length; i++) {
      for (int j = 0; j < i; j++) {
        if (elements[i].compareTo(elements[j]) < 0) {
          ArrayUtils.swap(elements, i, j);
        }
      }
    }
    return elements;
  }
}
