package codejam;

import java.util.Arrays;

/**
 * https://codingcompetitions.withgoogle.com/codejam/round/000000000043580a/00000000006d0a5c#problem
 */
public class ReverSort {

    public static void main(String[] args) {
        System.out.println(cost(new int[]{1, 2}));
        System.out.println(cost(new int[]{4, 2, 1, 3}));
        System.out.println(cost(new int[]{7, 6, 5, 4, 3, 2, 1}));
    }

    public static int cost(int in[]) {
        int cost = 0, temp;

        for (int i = 0; i < in.length; i++) {
            for (int j = i + 1; j < in.length; j++) {
                if (in[i] > in[j]) {
                    temp = in[i];
                    in[i] = in[j];
                    in[j] = temp;
                }
                cost++;
            }
        }
        System.out.println("Array: " + Arrays.toString(in));
        return cost;
    }
}
