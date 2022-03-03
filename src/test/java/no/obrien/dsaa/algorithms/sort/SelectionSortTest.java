package no.obrien.dsaa.algorithms.sort;

import static org.junit.jupiter.api.Assertions.assertTrue;

import no.obrien.dsaa.utilities.TestUtils;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

  @Test
  void testSelectionSort() {
    Integer[] elements = new Integer[10];
    for (int i = 0; i < elements.length; i++) {
      elements[i] = elements.length - i;
    }

    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    Integer[] result = selectionSort.sort(elements);

    assertTrue(TestUtils.isSorted(result));
  }
}
