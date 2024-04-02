public class BS {
  public static void main(String[] args) {
    int[] a = { 4, 2, 6, 1, 3 };
    bubbleRecursion(a, a.length - 1, 0);

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();
  }

  static void bubbleRecursion(int[] a, int r, int c) {
    if (r == 0) {
      return;
    }

    if (c == r) {
      bubbleRecursion(a, r - 1, 0);
      return;
    }

    if (a[c] > a[c + 1]) {
      int t = a[c];
      a[c] = a[c + 1];
      a[c + 1] = t;
    }

    bubbleRecursion(a, r, c + 1);
  }
}
