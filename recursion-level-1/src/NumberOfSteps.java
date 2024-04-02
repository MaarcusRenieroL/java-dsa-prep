public class NumberOfSteps {
  public static void main(String[] args) {
    int n = 14;
    System.out.println(numberOfSteps(n));
  }

  static int numberOfSteps(int n) {
    if (n == 0) {
      return 0;
    }

    if (n % 2 == 0) {
      return 1 + numberOfSteps(n / 2);
    } else {
      return 1 + numberOfSteps(n - 1);
    }
  }
}
