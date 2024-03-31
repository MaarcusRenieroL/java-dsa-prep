package implementation;

public class S {
  public static void main(String[] args) {
    Stack stack = new Stack(5);
    try {
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      stack.display();
      System.out.println(stack.pop());
      stack.display();
      System.out.println(stack.top());
      System.out.println(stack.size());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    DynamicStack dynamicStack = new DynamicStack(5);

    try {
      dynamicStack.push(1);
      dynamicStack.push(2);
      dynamicStack.push(3);
      dynamicStack.push(4);
      dynamicStack.push(5);
      dynamicStack.display();
      System.out.println(dynamicStack.pop());
      dynamicStack.display();
      System.out.println(dynamicStack.top());
      System.out.println(dynamicStack.size());
      dynamicStack.push(6);
      dynamicStack.push(7);
      dynamicStack.push(8);
      dynamicStack.push(9);
      dynamicStack.push(10);
      dynamicStack.push(11);
      dynamicStack.push(12);
      dynamicStack.push(13);
      dynamicStack.push(14);
      dynamicStack.push(15);
      dynamicStack.display();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class Stack {
  int[] data;
  int DEFAULT_SIZE = 10;
  int ptr = -1;

  Stack() {
    this.data = new int[DEFAULT_SIZE];
  }

  Stack(int size) {
    this.data = new int[size];
  }

  boolean isFull() {
    return ptr == data.length - 1;
  }

  boolean isEmpty() {
    return ptr == -1;
  }

  boolean push(int item) throws Exception {
    if (isFull()) {
      throw new Exception("Stack is full");
    } else {
      ptr++;
      data[ptr] = item;
      return true;
    }
  }

  int pop() throws Exception {
    if (isEmpty()) {
      throw new Exception("Stack is empty");
    } else {
      int temp = data[ptr];
      ptr--;

      return temp;
    }
  }

  int top() throws Exception {
    if (isEmpty()) {
      throw new Exception("Stack is empty");
    }
    return data[ptr];
  }

  int size() {
    return ptr + 1;
  }

  void display() {
    for (int i = 0; i <= ptr; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }
}

class DynamicStack extends Stack {
  DynamicStack() {
    super();
  }

  DynamicStack(int size) {
    super(size);
  }

  @Override
  boolean push(int item) throws Exception {

    if (isFull()) {
      int[] temp = new int[data.length * 2];

      for (int i = 0; i < data.length; i++) {
        temp[i] = data[i];
      }

      data = temp;
    }

    return super.push(item);
  }
}
