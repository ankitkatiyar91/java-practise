package learning;

public class Pattern2
{

    public static void main(String[] args)
    {
        pattern2(4);
    }

    static void pattern2(int n)
    {
        for (int i = 0; i < 2 * n - 1; i++)
        {
            for (int j = 0; j < 2 * n - 1; j++)
                System.out.print(1 + Math.max(Math.abs(n - i - 1), Math.abs(n - j - 1)));
            System.out.println();
        }
    }
}
