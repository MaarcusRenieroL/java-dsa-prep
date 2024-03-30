package questions;

public class RemoveDuplicatesFromSortedList {

  static void removeDuplicates(Node head) {
    Node temp = head;

    while (temp != null && temp.next != null) {
      if (temp.data == temp.next.data) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
    }
  }

  public static void main(String[] args) {
    LL ll = new LL();

    ll.insertAtLast(1);
    ll.insertAtLast(1);
    ll.insertAtLast(2);
    ll.insertAtLast(3);
    ll.insertAtLast(3);

    Node temp = ll.head;

    removeDuplicates(temp);

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}

class LL {
  Node head;
  Node tail;

  int size = 0;

  LL() {
    this.head = null;
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

}
