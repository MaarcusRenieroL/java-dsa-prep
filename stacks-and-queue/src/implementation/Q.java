package implementation;

public class Q {
  public static void main(String[] args) {
    Queue queue = new Queue(5);
    try {
      queue.push(1);
      queue.push(2);
      queue.push(3);
      queue.push(4);
      queue.push(5);
      queue.display();
      System.out.println(queue.pop());
      queue.display();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Circular Queue");

    CircularQueue circularQueue = new CircularQueue(5);

    try {
      circularQueue.push(1);
      circularQueue.push(2);
      circularQueue.push(3);
      circularQueue.push(4);
      circularQueue.push(5);
      circularQueue.display();
      System.out.println(circularQueue.remove());
      circularQueue.display();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    DynamicQueue dynamicQueue = new DynamicQueue(5);

    System.out.println("Dynamic Queue");

    try {
      dynamicQueue.push(1);
      dynamicQueue.push(2);
      dynamicQueue.push(3);
      dynamicQueue.push(4);
      dynamicQueue.push(5);
      dynamicQueue.display();
      System.out.println(dynamicQueue.remove());
      dynamicQueue.display();
      dynamicQueue.push(6);
      dynamicQueue.push(7);
      dynamicQueue.push(8);
      dynamicQueue.push(9);
      dynamicQueue.push(10);
      dynamicQueue.push(11);
      dynamicQueue.push(12);
      dynamicQueue.push(13);
      dynamicQueue.push(14);
      dynamicQueue.push(15);
      dynamicQueue.display();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class Queue {
  int[] data;
  int DEFAULT_SIZE = 10, end = 0;

  Queue() {
    this.data = new int[DEFAULT_SIZE];
  }

  Queue(int size) {
    this.data = new int[size];
  }

  boolean isFull() {
    return end == data.length;
  }

  boolean isEmpty() {
    return end == 0;
  }

  boolean push(int item) throws Exception {
    if (isFull()) {
      throw new Exception("Queue is full");
    }

    data[end++] = item;
    return true;
  }

  int pop() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }

    int removed = data[0];

    for (int i = 1; i < end; i++) {
      data[i - 1] = data[i];
    }

    end--;

    return removed;
  }

  void display() {
    for (int i = 0; i < end; i++) {
      System.out.print(data[i] + " ");
    }

    System.out.println();
  }
}

class CircularQueue {
  int front = 0, rear = 0, DEFAULT_SIZE = 10, size = 0;
  int[] data;

  CircularQueue() {
    this.data = new int[DEFAULT_SIZE];
  }

  CircularQueue(int size) {
    this.data = new int[size];
  }

  boolean isFull() {
    return size == data.length;
  }

  boolean isEmpty() {
    return size == 0;
  }

  boolean push(int item) {
    if (isFull()) {
      return false;
    }

    data[rear++] = item;
    rear = rear % data.length;
    size++;

    return true;
  }

  int remove() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }

    int removed = data[front++];
    front = front % data.length;
    size--;

    return removed;
  }

  void display() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
    }

    int i = front;

    do {
      System.out.print(data[i++] + " ");
      i %= data.length;
    } while (i != rear);

    System.out.println();
  }

  int size() {
    return size;
  }

  int front() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }

    return data[front];
  }

  int rear() {
    return data[rear - 1];
  }

}

class DynamicQueue extends CircularQueue {
  DynamicQueue() {
    super();
  }

  DynamicQueue(int size) {
    super(size);
  }

  @Override
  boolean push(int item) {
    if (isFull()) {
      int[] temp = new int[data.length * 2];

      for (int i = 0; i < size; i++) {
        temp[i] = data[(front + i) % data.length];
      }

      data = temp;

      front = 0;
      rear = size;

    }

    return super.push(item);
  }
}
