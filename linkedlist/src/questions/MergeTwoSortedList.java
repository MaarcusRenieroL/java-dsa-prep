package questions;

public class MergeTwoSortedList {

  static Node mergeTwoLists(Node head1, Node head2) {
    Node temp = new Node(0);
    Node current = temp;

    while (true) {
      if (head1 == null) {
        current.next = head2;
        break;
      }

      if (head2 == null) {
        current.next = head1;
        break;
      }

      if (head1.data <= head2.data) {
        current.next = head1;
        head1 = head1.next;
      } else {
        current.next = head2;
        head2 = head2.next;
      }

      current = current.next;
    }

    return temp.next;
  }

  public static void main(String[] args) {
    LL ll1 = new LL();
    LL ll2 = new LL();

    ll1.insertAtLast(1);
    ll1.insertAtLast(2);
    ll1.insertAtLast(4);

    ll2.insertAtLast(1);
    ll2.insertAtLast(3);
    ll2.insertAtLast(4);

    Node head1 = ll1.head;
    Node head2 = ll2.head;

    Node merged = mergeTwoLists(head1, head2);

    while (merged != null) {
      System.out.println(merged.data);
      merged = merged.next;
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
