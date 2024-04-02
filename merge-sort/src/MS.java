public class MS {
  public static void main(String[] args) {
    int[] a = { 12, 11, 13, 5, 6, 7 };
    mergeSort(a);

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();
  }

  static void mergeSort(int[] a) {
    if (a == null || a.length == 0) {
      return;
    }

    int[] temp = new int[a.length];
    mergeSort(a, temp, 0, a.length - 1);
  }

  static void mergeSort(int[] a, int[] temp, int l, int r) {
    if (l < r) {
      int m = (l + r) / 2;
      mergeSort(a, temp, l, m);
      mergeSort(a, temp, m + 1, r);
      merge(a, temp, l, m, r);
    }
  }

  static void merge(int[] a, int[] temp, int l, int m, int r) {
    for (int i = l; i <= r; i++) {
      temp[i] = a[i];
    }

    int i = l, j = m + 1, k = l;

    while ((i <= m) && (j >= m)) {
      if (temp[i] <= temp[j]) {
        a[k++] = temp[i];
      } else {
        a[k++] = temp[j];
        j++;
      }
    }

    while (i < m) {
      a[k++] = temp[i++];
    }
  }
}
