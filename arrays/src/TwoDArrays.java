import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] arr = new int[3][3];

    // 1 2 3
    // 4 5 6
    // 7 8 9

    // direct method of storing values in 2D array

    int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // indexing
    System.out.println(arr2[0][0]); // 1
    System.out.println(Arrays.toString(arr2[0])); // [1, 2, 3]

    // matrix with different number of columns

    int[][] arr3 = {
        { 1, 2, 3 }, // 0th index
        { 4, 5 }, // 1st index
        { 6, 7, 8, 9 } // 2nd index -> arr3[2] -> [6, 7, 8, 9]
    };

    // input

    int[][] arr4 = new int[3][3];

    for (int i = 0; i < arr4.length; i++) {
      for (int j = 0; j < arr4[i].length; j++) {
        arr4[i][j] = input.nextInt();
      }
    }

    // display

    for (int i = 0; i < arr4.length; i++) {
      for (int j = 0; j < arr4[i].length; j++) {
        System.out.print(arr4[i][j] + " ");
      }
      System.out.println();
    }

    // enhanced for loop

    for (int[] row : arr4) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }

    // toString

    for (int[] row : arr4) {
      System.out.println(Arrays.toString(row));
    }

    System.out.println(Arrays.deepToString(arr4));

    input.close();

  }
}
