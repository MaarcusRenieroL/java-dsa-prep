package questions;

public class SwapValues {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };

    System.out.println("Before swapping: ");
    for (int num : nums) {
      System.out.print(num + " ");
    }

    swap(nums, 0, 4);

    System.out.println("\nAfter swapping: ");

    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
