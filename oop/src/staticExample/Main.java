package staticExample;

class Human {
  int a, s;
  static int p;
  String n;
  boolean m;

  Human(int a, int s, String n, boolean m) {
    this.a = a;
    this.s = s;
    this.n = n;
    this.m = m;

    Human.p += 1;
  }
}

public class Main {
  public static void main(String[] args) {
    Human a = new Human(21, 100000, "a", false);
    Human b = new Human(24, 200000, "b", true);
  }

  static void fun() {
    // greeting();

    Main m = new Main();
    m.greeting();
  }

  void greeting() {
    System.out.println("Hello");
  }
}
