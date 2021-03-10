package no.obrien.dsaa.utilities;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ArrayUtils {

  /***
   * Perform an in-place swap of the elements given by the two indicies in the given array
   * @param elements The given array
   * @param firstIndex The index of the first element
   * @param secondIndex The index of the second element
   * @param <T> The type of elements in the given array
   */
  public <T> void swap(T[] elements, int firstIndex, int secondIndex) {
    T temp = elements[firstIndex];
    elements[firstIndex] = elements[secondIndex];
    elements[secondIndex] = temp;
  }

  public <T> T[] slice(T[] elements, int startIndex, int stopIndex) {
    Object[] result = new Object[stopIndex - startIndex];
    if (stopIndex >= 0) {
      System.arraycopy(elements, startIndex, result, 0, stopIndex);
    }
    return (T[]) result;
  }
}
