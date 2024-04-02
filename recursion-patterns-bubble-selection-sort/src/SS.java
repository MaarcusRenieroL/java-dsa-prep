public class SS {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    selectionSort(arr, arr.length, 0, 0);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  static void selectionSort(int[] a, int r, int c, int max) {
    if (r == 0) {
      return;
    }

    if (c < r) {
      if (a[c] > a[max]) {
        selectionSort(a, r, c + 1, c);
      } else {
        selectionSort(a, r, c + 1, max);
      }
    } else {
      int t = a[max];
      a[max] = a[r - 1];
      a[r - 1] = t;
      selectionSort(a, r - 1, 0, 0);

    }

  }
}
