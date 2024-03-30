package implementation;

public class LL {

  Node head;
  Node tail;

  int size;

  public LL() {
    this.size = 0;
  }

  void show() {
    Node node = head;

    while (node != null) {
      System.out.print(node.data + " -> ");
      node = node.next;
    }

    System.out.println("END");

  }

  void insertAtFirst(int value) {
    Node node = new Node(value);
    node.next = head;

    head = node;

    if (tail == null) {
      tail = head;
    }

    size += 1;
  }

  void insertAtLast(int value) {
    Node node = new Node(value);

    if (tail == null) {
      insertAtFirst(value);
    } else {
      tail.next = node;
      tail = node;

      size += 1;
    }

  }

  void insertAt(int index, int value) {
    Node temp = head;

    if (index == 0) {
      insertAtFirst(value);
    } else if (index == size) {
      insertAtLast(value);
    } else {
      for (int i = 1; i < index - 1; i++) {
        temp = temp.next;
      }

      Node node = new Node(value, temp.next);
      temp.next = node;

    }

    size += 1;
  }

  void deleteAtFirst() {
    head = head.next;
    size -= 1;
  }

  void deleteAtLast() {
    Node temp = head;

    for (int i = 1; i < size - 1; i++) {
      temp = temp.next;
    }

    temp.next = null;
    tail = temp;

    size -= 1;
  }

  void deleteAt(int index) {
    if (index == 0) {
      deleteAtFirst();
    } else if (index == size - 1) {
      deleteAtLast();
    } else {
      Node temp = getNodeAt(index - 1);

      temp.next = temp.next.next;

      size -= 1;
    }
  }

  void deleteNode(Node node) {
    node.data = node.next.data;
    node.next = node.next.next;

    size -= 1;
  }

  void search(int value) {
    Node temp = head;

    for (int i = 0; i < size; i++) {
      if (temp.data == value) {
        System.out.println("Found at index: " + i);
        return;
      }

      temp = temp.next;

    }
  }

  void updateAt(int index, int value) {
    Node temp = head;

    for (int i = 0; i < index - 1; i++) {
      temp = temp.next;
    }

    temp.data = value;
  }

  Node getNodeAt(int index) {
    Node temp = head;

    for (int i = 0; i < size; i++) {
      if (i == index) {
        return temp;
      }

      temp = temp.next;
    }

    return null;
  }

  int getValueAt(int index) {
    Node temp = head;

    for (int i = 0; i < size; i++) {
      if (i == index) {
        return temp.data;
      }

      temp = temp.next;
    }

    return -1;
  }

  int getIndexOf(int value) {
    Node temp = head;

    for (int i = 0; i < size; i++) {
      if (temp.data == value) {
        return i;
      }

      temp = temp.next;
    }

    return -1;
  }

  public static void main(String[] args) {
    LL ll = new LL();

    ll.insertAtFirst(1);
    ll.insertAtLast(2);
    ll.insertAtLast(6);
    ll.insertAtLast(3);
    ll.insertAtLast(4);
    ll.insertAtLast(5);
    ll.insertAtLast(6);

    ll.deleteNode(ll.getNodeAt(2));

    ll.show();

  }
}

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}
