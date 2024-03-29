package questions;

public class ReversingArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    reverseArray(arr);
  }

  static void reverseArray(int[] arr) {
    int[] reversedArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      reversedArr[i] = arr[arr.length - 1 - i];
    }

    for (int num : reversedArr) {
      System.out.print(num + " ");
    }
  }
}
