package no.obrien.dsaa.datastructures.lists;

import no.obrien.dsaa.datastructures.collections.lists.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testLinkedListAdd() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(0);
    linkedList.add(1);
    linkedList.add(2);

    Assertions.assertEquals(3, linkedList.size());
  }
}
