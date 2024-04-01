package practice;

public class Fibonacci {
  public static void main(String[] args) {
    int n = 55;
    for (int i = 0; i <= n; i++) {
      System.out.print(fibo(i) + " ");
    }

    System.out.println();
  }

  static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // optimized

  static int fibo(int n) {
    return (int) Math.round(Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5));
  }
}
