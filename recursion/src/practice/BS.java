package practice;

public class BS {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 10, 40 };
    int x = 10;
    int n = arr.length;
    int result = binarySearch(arr, 0, n - 1, x);

    if (result == -1) {
      System.out.println("Element not present");
    } else {
      System.out.println("Element found at index " + result);
    }
  }

  static int binarySearch(int[] arr, int l, int h, int x) {
    if (h >= l) {
      int m = l + (h - l) / 2;

      if (arr[m] == x) {
        return m;
      } else if (arr[m] > x) {
        return binarySearch(arr, l, m - 1, x);
      } else {
        return binarySearch(arr, m + 1, h, x);
      }
    }

    return -1;
  }
}
