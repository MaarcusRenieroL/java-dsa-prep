public class RBS {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(rbs(arr, 0, arr.length - 1, 3));
  }

  static int rbs(int[] arr, int l, int r, int s) {
    if (l > r) {
      return -1;
    }

    int m = l + (r - l) / 2;

    if (arr[m] == s) {
      return m;
    } else {
      if (arr[l] <= arr[m]) {
        if (s >= arr[l] && s <= arr[m]) {
          return rbs(arr, l, m - 1, s);
        } else {
          return rbs(arr, m + 1, r, s);
        }
      }

      if (s >= arr[m] && s <= arr[r]) {
        return rbs(arr, m + 1, r, s);
      } else {
        return rbs(arr, l, m - 1, s);
      }
    }

  }
}
