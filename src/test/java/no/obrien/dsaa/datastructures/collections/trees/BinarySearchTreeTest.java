package no.obrien.dsaa.datastructures.collections.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

  @Test
  void testConstruction() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

    assertTrue(binarySearchTree.isEmpty());
    assertFalse(binarySearchTree.isNotEmpty());
    assertEquals(0, binarySearchTree.size());
  }

  @Test
  void testAdd() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

    binarySearchTree.add(5);
    binarySearchTree.add(3);
    binarySearchTree.add(7);
    binarySearchTree.add(2);
    binarySearchTree.add(4);
    binarySearchTree.add(6);
    binarySearchTree.add(8);

    assertEquals(7, binarySearchTree.size());
  }

  @Test
  void testContains() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(5);
    binarySearchTree.add(3);
    binarySearchTree.add(7);
    binarySearchTree.add(2);
    binarySearchTree.add(4);
    binarySearchTree.add(6);
    binarySearchTree.add(8);

    assertEquals(7, binarySearchTree.size());
    assertTrue(binarySearchTree.contains(2));
    assertTrue(binarySearchTree.contains(3));
    assertTrue(binarySearchTree.contains(4));
    assertTrue(binarySearchTree.contains(5));
    assertTrue(binarySearchTree.contains(6));
    assertTrue(binarySearchTree.contains(7));
    assertTrue(binarySearchTree.contains(8));

    assertFalse(binarySearchTree.contains(0));
    assertFalse(binarySearchTree.contains(1));
    assertFalse(binarySearchTree.contains(9));
    assertFalse(binarySearchTree.contains(100));
  }
}
