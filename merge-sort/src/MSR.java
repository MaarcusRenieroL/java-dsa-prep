public class MSR {
  public static void main(String[] args) {
    int[] a = { 12, 11, 13, 5, 6, 7 };
    a = mergeSort(a);

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();
  }

  static int[] mergeSort(int[] a) {
    if (a.length == 1) {
      return a;
    }

    int m = a.length / 2;

    int[] l = new int[m];
    int[] r = new int[a.length - m];

    for (int i = 0; i < m; i++) {
      l[i] = a[i];
    }

    for (int i = m; i < a.length; i++) {
      r[i - m] = a[i];
    }

    l = mergeSort(l);
    r = mergeSort(r);

    return merge(l, r);
  }

  static int[] merge(int[] l, int[] r) {
    int[] m = new int[l.length + r.length];
    int i = 0, j = 0, k = 0;

    while ((i < l.length) && (j < r.length)) {
      if (l[i] < r[j]) {
        m[k] = l[i];
        i++;
      } else {
        m[k] = r[i];
        j++;
      }

      k++;
    }

    while (i < l.length) {
      m[k] = l[i];
      i++;
      k++;
    }

    while (j < r.length) {
      m[k] = r[j];
      j++;
      k++;
    }

    return m;
  }
}
