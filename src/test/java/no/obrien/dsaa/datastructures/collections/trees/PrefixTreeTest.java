package no.obrien.dsaa.datastructures.collections.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrefixTreeTest {

  @Test
  void testConstruction() {
    PrefixTree prefixTree = new PrefixTree();
    assertEquals(0, prefixTree.size());
    assertTrue(prefixTree.isEmpty());
    assertFalse(prefixTree.isNotEmpty());
  }

  @Test
  void testAddAndContainsElement() {
    PrefixTree prefixTree = new PrefixTree();
    prefixTree.add("car");
    assertEquals(1, prefixTree.size());
    prefixTree.add("cars");
    assertEquals(2, prefixTree.size());
    prefixTree.add("cash");
    assertEquals(3, prefixTree.size());
    prefixTree.add("tree");
    assertEquals(4, prefixTree.size());

    assertTrue(prefixTree.contains("car"));
    assertTrue(prefixTree.contains("cars"));
    assertTrue(prefixTree.contains("cash"));
    assertTrue(prefixTree.contains("tree"));
  }
}
