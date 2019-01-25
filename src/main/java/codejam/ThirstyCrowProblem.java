package codejam;

import java.util.Arrays;

public class ThirstyCrowProblem
{
    public static void main(String[] args)
    {

        /*
         * int[] input1 = { 2, 5, 5, 58 }; int input2 = 4; // number of pots int input3 = 3;
         * System.out.println(solve(input1, input2, input3));
         */
        String[] input1 = { "1#1", "2#5", "2#3" };
        String[] input2 = { "2#6#8#6#" };
        int input3;

    }

    public static int solve(int[] input1, int input2, int input3)
    {
        int totalStone = 0;
        int stoneNeeded = 0;
        int stoneInPot = 0;
        Arrays.sort(input1);
        for (int i = 0; i < input3; i++)
        {
            if (input1[i] > stoneInPot)
            {
                stoneNeeded = input1[i] - stoneInPot;
                stoneInPot += stoneNeeded;
                totalStone += stoneNeeded * (input2 - i);
            }
        }
        return totalStone;
    }
}
