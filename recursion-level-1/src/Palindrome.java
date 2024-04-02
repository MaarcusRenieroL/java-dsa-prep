public class Palindrome {
  public static void main(String[] args) {
    int n = 121;
    System.out.println(isPalindrome(n));
  }

  static boolean isPalindrome(int n) {
    return n == reverse(n);
  }

  static int reverse(int n) {
    if (n <= 9) {
      return n;
    } else {
      int d = n % 10;
      return d * (int) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
    }
  }
}
