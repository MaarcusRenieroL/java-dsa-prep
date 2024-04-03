public class Maze {
  public static void main(String[] args) {
    int r = 3, c = 3;
    // System.out.println(count(r, c));
    // path("", r, c);
    // pathWithDiagonal("", r, c);

    boolean[][] board = {
        { true, true, true },
        { true, false, true }, { true, true, true }
    };

    pathWithObstacles("", 0, 0, board);
  }

  static int count(int r, int c) {
    if (r == 1 || c == 1) {
      return 1;
    }

    int left = count(r - 1, c), right = count(r, c - 1);

    return left + right;
  }

  static void path(String p, int r, int c) {
    if (r == 1 && c == 1) {
      System.out.println(p);
      return;
    }

    if (r > 1) {
      path(p + "D", r - 1, c);
    }

    if (c > 1) {
      path(p + "R", r, c - 1);
    }
  }

  static void pathWithDiagonal(String p, int r, int c) {
    if (r == 1 && c == 1) {
      System.out.println(p);
      return;
    }

    if (r > 1) {
      pathWithDiagonal(p + "D", r - 1, c);
    }

    if (c > 1) {
      pathWithDiagonal(p + "R", r, c - 1);
    }

    if (r > 1 && c > 1) {
      pathWithDiagonal(p + "X", r - 1, c - 1);
    }
  }

  static void pathWithObstacles(String p, int r, int c, boolean[][] maze) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(p);
      return;
    }

    if (!maze[r][c]) {
      return;
    }

    if (r < maze.length - 1) {
      pathWithObstacles(p + "D", r + 1, c, maze);
    }

    if (c < maze[0].length - 1) {
      pathWithObstacles(p + "R", r, c + 1, maze);
    }
  }

}
