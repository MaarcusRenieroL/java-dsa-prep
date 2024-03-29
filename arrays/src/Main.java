public class Main {
  public static void main(String[] args) {
    // store a roll number
    int rollNumber = 101;

    // store a name
    String name = "John";

    // store 5 roll numbers
    int rno1 = 101;
    int rno2 = 102;
    int rno3 = 103;
    // .
    // .

    // syntax
    // datatype[] arrayName = new datatype[size];
    // store 5 roll numbers in an array

    int[] rollNumbers = new int[5];
    int[] rnos = { 101, 102, 103, 104, 105 };

    int[] arr; // declaration of array. arr getting defined in the stack
    arr = new int[5]; // initialization of array. arr getting defined in the heap memory. this is
                      // called dynamic memory allocation

    // indexing

    System.out.println(rnos[0]); // 0

  }
}
