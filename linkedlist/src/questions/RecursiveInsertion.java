package questions;

public class RecursiveInsertion {

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

  class LL {
    Node head;

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

    void insertRecursive(int value) {
      head = insertRecursive(head, value);
    }

    Node insertRecursive(Node node, int value) {
      if (node == null) {
        return new Node(value);
      }

      node.next = insertRecursive(node.next, value);

      return node;
    }
  }

  public static void main(String[] args) {
    RecursiveInsertion recursiveInsertion = new RecursiveInsertion();
    LL ll = recursiveInsertion.new LL();

    ll.insertRecursive(1);
    ll.insertRecursive(2);
    ll.insertRecursive(3);
    ll.insertRecursive(4);
    ll.insertRecursive(5);

    ll.show();
  }
}
