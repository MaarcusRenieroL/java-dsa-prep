import java.util.ArrayList;

public class Subsets {
  public static void main(String[] args) {
    subsets("abc", "");
    System.out.println(subsetsRet("abc", ""));
    ArrayList<String> s = ascii(subsetsRet("abc", ""));
    System.out.println(s);

  }

  static void subsets(String s, String p) {
    if (s.length() == 0) {
      System.out.println(p);
      return;
    }

    subsets(s.substring(1), p + s.charAt(0));
    subsets(s.substring(1), p);
  }

  static ArrayList<String> subsetsRet(String s, String p) {
    if (s.length() == 0) {
      ArrayList<String> temp = new ArrayList<>();
      temp.add(p);
      return temp;
    }

    ArrayList<String> left = subsetsRet(s.substring(1), p + s.charAt(0));
    ArrayList<String> right = subsetsRet(s.substring(1), p);

    left.addAll(right);
    return left;

  }

  static ArrayList<String> ascii(ArrayList<String> s) {
    if (s.size() == 0) {
      return null;
    }

    ArrayList<String> temp = new ArrayList<>();

    for (String str : s) {
      String t = "";
      for (int i = 0; i < str.length(); i++) {
        t += (int) str.charAt(i);
      }

      temp.add(t);
    }

    return temp;
  }
}
