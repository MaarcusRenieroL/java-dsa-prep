package questions;

public class MaxValueOfArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(maxValue(arr));
  }

  static int maxValue(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
      if (num > max) {
        max = num;
      }
    }

    return max;
  }
}
