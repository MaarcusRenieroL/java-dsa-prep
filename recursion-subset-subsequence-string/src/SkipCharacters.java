public class SkipCharacters {
  public static void main(String[] args) {
    skip("abc", "");
    System.out.println(skip("abca"));
    System.out.println(skipString("Apple is a fruit"));
    System.out.println(skipStringApp("Apple is a fruit"));
    System.out.println(skipStringApp("App is a fruit"));

  }

  static void skip(String s, String res) {
    if (s.length() == 0) {
      System.out.println(res);
      return;
    }

    if (s.charAt(0) == 'a') {
      skip(s.substring(1), res);
    } else {
      skip(s.substring(1), res + s.charAt(0));
    }
  }

  static String skip(String s) {
    if (s.length() == 0) {
      return "";
    }

    if (s.charAt(0) == 'a') {
      return skip(s.substring(1));
    } else {
      return s.charAt(0) + skip(s.substring(1));
    }
  }

  static String skipString(String s) {
    if (s.length() == 0) {
      return "";
    }

    if (s.startsWith("Apple")) {
      return skipString(s.substring(5));
    } else {
      return s.charAt(0) + skipString(s.substring(1));
    }
  }

  static String skipStringApp(String s) {
    if (s.length() == 0) {
      return "";
    }

    if (!s.startsWith("Apple") && s.startsWith("App")) {
      return skipString(s.substring(3));
    } else {
      return s.charAt(0) + skipString(s.substring(1));
    }
  }

}
