package no.obrien.dsaa.datastructures.collections.stacks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ArrayStackTest {

  @Test
  void testConstruction() {
    Stack<Integer> stack = new ArrayStack<>();
    assertEquals(0, stack.size());
    assertTrue(stack.isEmpty());
    assertFalse(stack.isNotEmpty());
  }

  @Test
  void testPushPop() {
//    Stack<Integer> stack = new ArrayStack<>();
//    final int testValue = 456;
//
//    stack.push(testValue);
//
//    assertEquals(1, stack.size());
//    assertEquals(testValue, stack.peek());
//
//    int result = stack.pop();
//    assertEquals(testValue, result);
//    assertEquals(0, stack.size());
  }
}
