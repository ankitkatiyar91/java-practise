package cci;

/**
 * Problem: 8.3
 */
public class MagicIndex {

    public static void main(String[] args) {
        int[] in = {-1, -1, 1, 2, 3, 4, 4, 4, 5, 5, 10, 12, 14};

        findSimple(in);
        findFast(in);
    }

    private static void findFast(int[] in) {
//        start from mid
        int index = in.length / 2;

        while (index < in.length || index > -1) {
            System.out.println("Finding at: " + index);
            if (in[index] == index) {
                System.out.println("Magic index: " + index + " has value: " + in[index]);
                break;
            }
            if (index > 0) {
                if (in[index] < index) {
                    index = index / 2;
                } else {
                    index = (in.length - index) / 2;
                }
            } else {
                System.out.println("Not found");
                break;
            }
        }
    }

    private static void findSimple(int[] in) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == i) {
                System.out.println("Magic index: " + i + " has value: " + in[i]);
                break;
            }
        }
    }
}
