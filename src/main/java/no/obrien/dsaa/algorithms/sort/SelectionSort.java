package no.obrien.dsaa.algorithms.sort;

import no.obrien.dsaa.utilities.ArrayUtils;

public class SelectionSort<T extends Comparable<T>> implements Sorter<T> {

  @Override
  public T[] sort(T[] elements) {
    for (int i = 0; i < elements.length; i++) {
      int minimumIndex = i;
      for (int j = i; j < elements.length - 1; j++) {
        if (elements[j].compareTo(elements[j + 1]) > 0) {
          minimumIndex = j + 1;
        }
      }
      ArrayUtils.swap(elements, i, minimumIndex);
    }

    return elements;
  }
}
