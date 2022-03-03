package no.obrien.dsaa.algorithms.sort;

import no.obrien.dsaa.utilities.ArrayUtils;

public class BubbleSort<T extends Comparable<T>> implements Sorter<T> {

  @Override
  public T[] sort(T[] elements) {
    boolean swapped = false;

    for (int i = 0; i < elements.length - 1; i++) {
      if (elements[i].compareTo(elements[i + 1]) > 0) {
        swapped = true;
        ArrayUtils.swap(elements, i, i + 1);
      }
    }

    return !swapped ? elements : sort(elements);
  }
}
