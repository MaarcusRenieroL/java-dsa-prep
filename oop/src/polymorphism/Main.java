package polymorphism;

public class Main {
  public static void main(String[] args) {
    Shapes sh = new Shapes();

    Circle c = new Circle();
    Square s = new Square();

    sh.area();
    c.area();
  }
}

class Shapes {
  void area() {
    System.out.println("I am in shapes");
  }
}

class Circle extends Shapes {
  @Override
  void area() {
    System.out.println("Area is 3.14 * r * r");
  }
}

class Triangle extends Shapes {
  void area() {
    System.out.println("Area is 0.5 * b * h");
  }
}

class Square extends Shapes {
  void area() {
    System.out.println("Area is s * s");
  }
}
