package no.obrien.dsaa.utilities;

public class TestUtils {

  public static <T extends Comparable<T>> boolean isSorted(T[] elements) {
    for (int i = 0; i < elements.length - 1; i++) {
      if (elements[i].compareTo(elements[i + 1]) > 0) {
        return false;
      }
    }
    return true;
  }
}
