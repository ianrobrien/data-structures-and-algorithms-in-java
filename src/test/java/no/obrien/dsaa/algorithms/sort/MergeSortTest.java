package no.obrien.dsaa.algorithms.sort;

import static org.junit.jupiter.api.Assertions.assertTrue;

import no.obrien.dsaa.utilities.TestUtils;
import org.junit.jupiter.api.Test;

class MergeSortTest {

  @Test
  void testMergeSort() {
    Integer[] elements = new Integer[10];
    for (int i = 0; i < elements.length; i++) {
      elements[i] = elements.length - i;
    }

    MergeSort<Integer> mergeSort = new MergeSort<>();
    Integer[] result = mergeSort.sort(elements);

    assertTrue(TestUtils.isSorted(result));
  }
}
