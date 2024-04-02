public class ReverseANumber {
  public static void main(String[] args) {
    int n = 12345;
    System.out.println(reverse(n));
  }

  static int reverse(int n) {
    if (n <= 9) {
      return n;
    } else {
      int d = n % 10;
      System.out.print(d);
      return reverse(n / 10);
    }
  }
}
