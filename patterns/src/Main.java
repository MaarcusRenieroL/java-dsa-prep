public class Main {
  public static void main(String[] args) {
    // p1(5);
    // p2(5);
    // p3(5);
    // p4(5);
    // p5(5);
    // p6(5);
    // p28(5);
    // p30(5);
    // p17(5);
    p31(5);

  }

  static void p1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p2(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  static void p5(int n) {
    for (int i = 0; i < 2 * n; i++) {
      int tr = i > n ? 2 * n - i : i;
      for (int j = 0; j < tr; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p28(int n) {
    for (int i = 0; i < 2 * n; i++) {
      int tr = i > n ? 2 * n - i : i;
      int s = n - tr;

      for (int j = 0; j < s; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < tr; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p30(int n) {
    for (int i = 1; i <= n; i++) {

      for (int j = 0; j < n - i; j++) {
        System.out.print("  ");
      }

      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }

      for (int j = 2; j <= i; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
    }
  }

  static void p17(int n) {
    for (int row = 1; row <= 2 * n; row++) {

      int c = row > n ? 2 * n - row : row;

      for (int space = 0; space < n - c; space++) {
        System.out.print("  ");
      }

      for (int col = c; col >= 1; col--) {
        System.out.print(col + " ");
      }
      for (int col = 2; col <= c; col++) {
        System.out.print(col + " ");
      }

      System.out.println();
    }
  }

  static void p31(int n) {
    int originalN = n;
    n = 2 * n;
    for (int row = 0; row <= n; row++) {
      for (int col = 0; col <= n; col++) {
        int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
        System.out.print(atEveryIndex + " ");
      }
      System.out.println();
    }
  }
}
