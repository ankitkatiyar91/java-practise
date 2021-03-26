package cci;

import util.ArrayUtils;

/**
 * Rotating an image by 90 degree.
 */
public class ImageRotation {


    public static void main(String[] args) {
        final int[][] source = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Source: " + ArrayUtils.printArray(source));

        final int[][] dest = rotate90(source);
        System.out.println("Outcome 90: " + ArrayUtils.printArray(dest));

        System.out.println("Outcome 180: " + ArrayUtils.printArray(rotate90(dest)));

        System.out.println("Outcome 90: " + ArrayUtils.printArray(rotate90(new int[][]{{1, 2}})));

        System.out.println("Outcome 90: " + ArrayUtils.printArray(rotate90(new int[][]{{1}, {2}})));
    }

    private static int[][] rotate90(final int[][] source) {
        final int[][] dest = new int[source[0].length][source.length];

        int r = 0, c = 0;
        for (int i = 0; i < source.length; i++) {
            for (int j = source[i].length - 1; j > -1; j--) {
                dest[r][c] = source[i][j];
                r++;
            }
            r = 0;
            c++;
        }
        return dest;
    }

}
