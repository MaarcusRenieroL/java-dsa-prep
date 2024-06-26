package staticExample;

public class InnerClasses {
  static class Test {
    String name;

    public Test(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }
  }

  public static void main(String[] args) {
    Test a = new Test("a");
    Test b = new Test("b");

    System.out.println(a.name);
    System.out.println(b.name);
  }
}
