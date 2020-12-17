package no.obrien.dsaa.datastructures.lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

  @Test
  void testRemove() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(0);
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);


    linkedList.remove(0); // remove from head
    assertEquals(4, linkedList.size());

    linkedList.remove(2); // remove from middle
    assertEquals(3, linkedList.size());

    linkedList.remove(4); // remove from tail
    assertEquals(2, linkedList.size());

    assertFalse(linkedList.contains(0));
    assertFalse(linkedList.contains(2));
    assertFalse(linkedList.contains(4));

    assertTrue(linkedList.contains(1));
    assertTrue(linkedList.contains(3));
  }

  @Test
  void testGet() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(0);
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);

    assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(-1));
    assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(10));
    assertEquals(3, linkedList.get(3));
  }

  @Test
  void testClear() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(0);
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);

    linkedList.clear();
    assertEquals(0, linkedList.size());
  }
}
