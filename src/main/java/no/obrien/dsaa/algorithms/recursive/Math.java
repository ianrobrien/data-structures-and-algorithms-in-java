package no.obrien.dsaa.algorithms.recursive;

public class Math {

  public int fibonacci(int n) {
    switch (n) {
      case 0:
        return 0;
      case 1:
        return 1;
      default:
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public int factorial(int n) {
    return (n == 0) ? 1 : n * factorial(n - 1);
  }
}
