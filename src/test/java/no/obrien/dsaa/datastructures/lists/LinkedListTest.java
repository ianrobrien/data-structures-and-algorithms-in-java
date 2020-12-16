package no.obrien.dsaa.datastructures.lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import no.obrien.dsaa.datastructures.collections.lists.LinkedList;
import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  void testAdd() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(0);
    linkedList.add(1);
    linkedList.add(2);

    assertEquals(3, linkedList.size());
  }

  @Test
  void testContains() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(0);
    linkedList.add(1);
    linkedList.add(2);

    assertTrue(linkedList.contains(0));
    assertTrue(linkedList.contains(1));
    assertTrue(linkedList.contains(2));
    assertFalse(linkedList.contains(9));
  }
}
