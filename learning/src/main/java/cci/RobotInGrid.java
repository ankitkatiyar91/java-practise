package cci;

/**
 * Problem: 8.2
 */
public class RobotInGrid {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
        };
        System.out.println("Sending robot:" + isTherePath(grid) + " Path:" + path);
    }

    private static boolean isTherePath(int[][] grid) {
        return isTherePathBetween(grid, 0, 0, grid.length - 1, grid[0].length - 1);
    }

    static StringBuilder path = new StringBuilder("(0,0)");

    private static boolean isTherePathBetween(int[][] grid, int a, int b, int x, int y) {
//        System.out.println("Checking (" + a + "," + b + ") and (" + x + "," + y + ")");
        if (a < 0 || b < 0 || x < 0 || y < 0) {
            return false;
        }
        if (a == x && b == y && grid[a][b] == 0) {
            return true;
        }
        if (x - a <= 1 && y - b <= 1) {
            boolean found = grid[a][b] == 0 && grid[x][y] == 0;
//            System.out.println("Checking (" + a + "," + b + ") and (" + x + "," + y + ") and found: " + found);
            if (found) {
                path.append(" -> (" + x + "," + y + ")");
            } else {
                path = new StringBuilder("(0,0)");
            }
            return found;
        }

        return ((isTherePathBetween(grid, a, b, x - 1, y - 1) && isTherePathBetween(grid, x - 1, y - 1, x, y))
                || (isTherePathBetween(grid, a, b, x, y - 1) && isTherePathBetween(grid, x, y - 1, x, y))
                || (isTherePathBetween(grid, a, b, x - 1, y) && isTherePathBetween(grid, x - 1, y, x, y))
        );
    }
}
