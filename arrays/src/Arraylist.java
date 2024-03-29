import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    // add elements

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);

    ArrayList<Integer> list2 = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      list2.add(input.nextInt());
    }

    System.out.println(list); // [10, 20, 30, 40]

    list.size();

    list.get(1); // 20

    list.contains(20); // true

    list.set(1, 99); // [10, 99, 30, 40]

    list.remove(2); // [10, 99, 40]

    list.clear(); // []

    list.isEmpty(); // true

    input.close();

    // displaying elements

    for (int i = 0; i < list2.size(); i++) {
      System.out.println(list2.get(i));
    }
  }
}
