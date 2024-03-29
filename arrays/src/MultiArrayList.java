import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // initializing the inner arraylists

    for (int i = 0; i < 3; i++) {
      list.add(new ArrayList<>());
    }

    // add elements

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        list.get(i).add(input.nextInt());
      }
    }

    // display

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(list.get(i).get(j) + " ");
      }
      System.out.println();
    }

    // enhanced for loop

    for (ArrayList<Integer> row : list) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }

    input.close();
  }
}
