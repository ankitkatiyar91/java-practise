package codejam.linkedin;

import java.io.PrintWriter;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        stiarcase();

        sum(new int[] { 1, 2, 3, 4, 5 });

    }

    private static int sum(int[] numbers)
    {
        int sum = 0;
        for (int i : numbers)
        {
            sum += i;
        }

        return sum;
    }

    static void stiarcase()
    {
        int n = new Scanner(System.in).nextInt();
        PrintWriter out = new PrintWriter(System.out);
        int j = 1;
        for (int i = 0; i < n; i++)
        {

            for (int k = n; k > j; k--)
            {
                out.print(" ");
            }
            for (int k = 0; k < j; k++)
            {
                out.print("#");
            }
            out.println();
            j++;

        }
        out.close();
    }
}
