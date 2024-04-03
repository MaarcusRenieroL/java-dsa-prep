import java.util.ArrayList;

public class StringPermutations {
  public static void main(String[] args) {
    String s = "abc";
    permutations(s, "");
    System.out.println(permutationsRet(s, ""));
  }

  static void permutations(String s, String p) {
    if (s.isEmpty()) {
      System.out.println(p);
      return;
    }

    char c = s.charAt(0);

    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0, i);
      String l = p.substring(i, p.length());

      permutations(s.substring(1), f + c + l);
    }
  }

  static ArrayList<String> permutationsRet(String s, String p) {
    if (s.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    char c = s.charAt(0);
    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0, i);
      String l = p.substring(i, p.length());

      list.addAll(permutationsRet(s.substring(1), f + c + l));
    }

    return list;
  }
}
