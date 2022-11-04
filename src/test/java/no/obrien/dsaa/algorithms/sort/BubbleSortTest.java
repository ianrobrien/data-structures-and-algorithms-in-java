package no.obrien.dsaa.algorithms.sort;

import no.obrien.dsaa.utilities.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BubbleSortTest {

    @Test
    void testBubbleSort() {
        var elements = new Integer[10];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = elements.length - i;
        }

        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        var result = bubbleSort.sort(elements);

        assertTrue(TestUtils.isSorted(result));
    }
}
