package staticExample;

public class StaticBlock {
  static int a = 4;
  static int b;

  static {
    System.out.println("Static Block");
    b = a * 5;
  }

  public static void main(String[] args) {
    StaticBlock s = new StaticBlock();
    System.out.println(a + " " + b);

    StaticBlock.b += 3;

    StaticBlock o = new StaticBlock();
    System.out.println(a + " " + b);
  }
}
