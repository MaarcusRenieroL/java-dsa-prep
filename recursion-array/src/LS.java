import java.util.ArrayList;

public class LS {

  static ArrayList<Integer> list = new ArrayList<Integer>();

  public static void main(String[] args) {
    int[] n = { 1, 2, 1, 4, 5 };
    int s = 1;
    ls(n, 0, s);

    System.out.println(list);

    ArrayList<Integer> result = ls(n, s, 0, new ArrayList<Integer>());

    System.out.println(result);

    ArrayList<Integer> result1 = lswal(n, s, 0);

    System.out.println(result1);
  }

  static void ls(int[] n, int i, int s) {
    if (i == n.length) {
      return;
    } else {
      if (n[i] == s) {
        list.add(i);
      }
      ls(n, i + 1, s);
    }
  }

  static ArrayList<Integer> ls(int[] n, int s, int i, ArrayList<Integer> list) {
    if (i == n.length) {
      return list;
    }

    if (n[i] == s) {
      list.add(i);
    }

    return ls(n, s, i + 1, list);

  }

  static ArrayList<Integer> lswal(int[] n, int s, int i) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    if (i == n.length) {
      return list1;
    }

    if (n[i] == s) {
      list1.add(i);
    }

    ArrayList<Integer> temp = lswal(n, s, i + 1);

    list1.addAll(temp);
    return list1;

  }
}
