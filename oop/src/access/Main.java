package access;

public class Main {
  public static void main(String[] args) {
    A o = new A(1, "a");

    // int n = o.n;

  }
}

class A {
  private int n;
  String name;
  int[] arr;

  A(int n, String name) {
    this.n = n;
    this.name = name;
    this.arr = new int[n];
  }

}
