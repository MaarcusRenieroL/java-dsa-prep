public class LectOne {
  public static void main(String[] args) {
    // store 5 roll numbers

    int[] r = new int[5];

    // store 5 names

    String[] n = new String[5];

    // data of 5 students

    int[] rnos = new int[5];
    String[] names = new String[5];
    float[] marks = new float[5];

    Student[] s = new Student[5];

    Student m = new Student();

    System.out.println(m.r + " " + m.n + " " + m.m);

    m.r = 27;
    m.n = "Maarcus";
    m.m = 99;

    System.out.println(m.r + " " + m.n + " " + m.m);

    m.greeting();

    m.changeName("Maarcus Reniero L");
    System.out.println(m.r + " " + m.n + " " + m.m);

    m.greeting();
  }

}

// creating class

class Student {
  int r;
  String n;
  float m;

  // default constructor
  Student() {
    this.r = 1;
    this.n = "n";
    this.m = 1;
  }

  // parameterized constructor
  Student(int r, String n, float m) {
    this.r = r;
    this.n = n;
    this.m = m;
  }

  void greeting() {
    System.out.println("Hello! My name is " + this.n);
  }

  void changeName(String n) {
    this.n = n;
  }
}
