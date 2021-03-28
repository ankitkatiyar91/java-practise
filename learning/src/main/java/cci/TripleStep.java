package cci;

/**
 * Problem: 8.1
 */
public class TripleStep {

    public static void main(String[] args) {
//        System.out.println("For 3: " + possibleWaysToStep(3));
//        System.out.println("For 4: " + possibleWaysToStep(4));
//        System.out.println("For 5: " + possibleWaysToStep(5));
        System.out.println("For 10: " + possibleWaysToStep(10));
    }

    // Memory for dynamic programming
    static int[] mem;

    private static int possibleWaysToStep(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        if (i == 2) return 2;
        if (i == 3) return 3;
        if (mem == null) {
            mem = new int[i + 1];
        }
        if (mem[i] == 0) {
            System.out.println("Finding for:" + i);
            mem[i] = possibleWaysToStep(i - 1) + possibleWaysToStep(i - 2) + possibleWaysToStep(i - 3);
        }

        return mem[i];
    }
}
