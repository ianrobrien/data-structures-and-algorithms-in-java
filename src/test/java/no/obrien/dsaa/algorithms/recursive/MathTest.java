package no.obrien.dsaa.algorithms.recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathTest {

  @Test
  void testFibonacciSequence() {
    Math math = new Math();
    assertEquals(0, math.fibonacci(0));
    assertEquals(1, math.fibonacci(1));
    assertEquals(1, math.fibonacci(2));
    assertEquals(2, math.fibonacci(3));
    assertEquals(3, math.fibonacci(4));
    assertEquals(5, math.fibonacci(5));
    assertEquals(8, math.fibonacci(6));
    assertEquals(13, math.fibonacci(7));
    assertEquals(21, math.fibonacci(8));
    assertEquals(34, math.fibonacci(9));
  }

  @Test
  void testFactorial() {
    Math math = new Math();
    assertEquals(1, math.factorial(0));
    assertEquals(1, math.factorial(1));
    assertEquals(2, math.factorial(2));
    assertEquals(6, math.factorial(3));
    assertEquals(24, math.factorial(4));
    assertEquals(120, math.factorial(5));
    assertEquals(720, math.factorial(6));
    assertEquals(5040, math.factorial(7));
    assertEquals(40320, math.factorial(8));
    assertEquals(362880, math.factorial(9));
  }
}
