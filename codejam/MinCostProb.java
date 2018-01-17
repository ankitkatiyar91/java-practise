package codejam;

import java.util.StringTokenizer;

public class MinCostProb
{
    public static void main(String[] args)
    {
        String input1 = "-1@10@-1#10@2@10#-1@10@-1";
        minimumpossiblecost(input1);
    }

    public static int minimumpossiblecost(String input1)
    {
        StringTokenizer rows = new StringTokenizer(input1, "#");
        StringTokenizer cols;
        int[][] inputData = new int[rows.countTokens()][];
        int i = 0;
        while (rows.hasMoreTokens())
        {
            cols = new StringTokenizer(rows.nextToken(), "@");
            inputData[i] = new int[cols.countTokens()];
            for (int j = 0; cols.countTokens() > 0; j++)
            {
                // String s = ;
                // System.out.println("Extracted:" + i + "," + j + " " + Integer.parseInt(s));
                inputData[i][j] = Integer.parseInt(cols.nextToken());
            }
            i++;
        }

        int[][] tempArray = new int[inputData.length][inputData[0].length];
        System.arraycopy(inputData, 0, tempArray, 0, inputData.length);

        modifyOne(tempArray);

        return 0;
    }

    static void modifyOne(int[][] tempArray)
    {
        for (int[] js : tempArray)
        {
            for (int j : js)
            {
                if (j != -1)
                {

                }
            }
        }
    }

    static void printArray(int[][] inputData)
    {
        for (int[] is : inputData)
        {
            for (int j : is)
            {
                System.out.print(j + ",");
            }
            System.out.println("");
        }
    }
}
