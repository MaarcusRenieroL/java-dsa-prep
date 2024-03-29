import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    System.out.println(arr[3]); // 40

    // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

    // another way: input using for loop

    int[] rollNumbers = new int[5];
    for (int i = 0; i < rollNumbers.length; i++) {
      rollNumbers[i] = input.nextInt();
    }

    // displaying
    for (int i = 0; i < rollNumbers.length; i++) {
      System.out.println(rollNumbers[i]);
    }

    // enhanced for loop
    for (int rollNumber : rollNumbers) {
      System.out.println(rollNumber); // roll number here represents the element of the array
    }

    // for array of objects

    String[] names = new String[5];
    for (int i = 0; i < names.length; i++) {
      names[i] = input.next();
    }

    for (String name : names) {
      System.out.println(name);
    }

    input.close();
  }
}
