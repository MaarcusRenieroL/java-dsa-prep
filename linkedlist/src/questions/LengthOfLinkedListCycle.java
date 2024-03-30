package questions;

public class LengthOfLinkedListCycle {

  static int length(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        Node temp = slow;
        int l = 0;
        do {
          l += 1;
          temp = temp.next;
        } while (temp != slow);

        return l;
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    LL ll = new LL();

    ll.insertAtFirst(1);

    ll.insertAtLast(2);
    ll.insertAtLast(3);
    ll.insertAtLast(4);
    ll.insertAtLast(5);
    ll.insertAtLast(6);
    ll.insertAtLast(7);
    ll.insertAtLast(8);
    ll.insertAtLast(9);
    ll.insertAtLast(10);

    Node head = ll.head;

    Node temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = head.next.next.next;

    System.out.println(length(head));
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
}
