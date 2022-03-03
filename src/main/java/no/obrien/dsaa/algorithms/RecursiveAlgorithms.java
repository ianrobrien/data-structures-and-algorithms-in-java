package no.obrien.dsaa.algorithms;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RecursiveAlgorithms {

  public int fibonacci(int n) {
    return switch (n) {
      case 0 -> 0;
      case 1 -> 1;
      default -> fibonacci(n - 1) + fibonacci(n - 2);
    };
  }

  public int factorial(int n) {
    return (n == 0) ? 1 : n * factorial(n - 1);
  }
}
