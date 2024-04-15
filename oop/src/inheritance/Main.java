package inheritance;

public class Main {
  public static void main(String[] args) {
    Box b1 = new Box(4.6, 7.9, 9.9);
    Box b2 = new Box(b1);
    BoxWeight b3 = new BoxWeight();

    System.out.println(b1.l + " " + b1.h + " " + b1.b);
    System.out.println(b2.l + " " + b2.h + " " + b2.b);
    System.out.println(b3.l + " " + b3.h + " " + b3.b + " " + b3.w);

    Box box5 = new BoxWeight(2, 3, 4, 5);
    box5.info();

  }
}

class Box {
  double l, h, b;

  Box() {
    this.h = -1;
    this.l = -1;
    this.b = -1;
  }

  Box(double s) {
    this.h = s;
    this.l = s;
    this.b = s;
  }

  Box(double l, double h, double b) {
    this.h = h;
    this.l = l;
    this.b = b;
  }

  Box(Box o) {
    this.h = o.h;
    this.l = o.l;
    this.b = o.b;
  }

  public void info() {
    System.out.println("Running the box");
  }
}

class BoxWeight extends Box {
  double w;

  BoxWeight() {
    this.w = -1;
  }

  BoxWeight(double l, double h, double b, double w) {
    super(l, h, b);
    this.w = w;
  }
}
