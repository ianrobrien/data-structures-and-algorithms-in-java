package no.obrien.dsaa.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RecursiveAlgorithmsTest {

  @Test
  void testFibonacciSequence() {
    assertEquals(0, RecursiveAlgorithms.fibonacci(0));
    assertEquals(1, RecursiveAlgorithms.fibonacci(1));
    assertEquals(1, RecursiveAlgorithms.fibonacci(2));
    assertEquals(2, RecursiveAlgorithms.fibonacci(3));
    assertEquals(3, RecursiveAlgorithms.fibonacci(4));
    assertEquals(5, RecursiveAlgorithms.fibonacci(5));
    assertEquals(8, RecursiveAlgorithms.fibonacci(6));
    assertEquals(13, RecursiveAlgorithms.fibonacci(7));
    assertEquals(21, RecursiveAlgorithms.fibonacci(8));
    assertEquals(34, RecursiveAlgorithms.fibonacci(9));
  }

  @Test
  void testFactorial() {
    assertEquals(1, RecursiveAlgorithms.factorial(0));
    assertEquals(1, RecursiveAlgorithms.factorial(1));
    assertEquals(2, RecursiveAlgorithms.factorial(2));
    assertEquals(6, RecursiveAlgorithms.factorial(3));
    assertEquals(24, RecursiveAlgorithms.factorial(4));
    assertEquals(120, RecursiveAlgorithms.factorial(5));
    assertEquals(720, RecursiveAlgorithms.factorial(6));
    assertEquals(5040, RecursiveAlgorithms.factorial(7));
    assertEquals(40320, RecursiveAlgorithms.factorial(8));
    assertEquals(362880, RecursiveAlgorithms.factorial(9));
  }
}
