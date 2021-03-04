package no.obrien.dsaa.algorithms.sort;

public interface Sorter<T extends Comparable<T>> {

  T[] sort(T[] elements);

}
