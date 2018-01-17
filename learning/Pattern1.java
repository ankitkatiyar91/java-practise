package learning;

public class Pattern1
{
    public static void main(String[] args)
    {
        int n = 4;
        int cnt = 1;
        for (int i = 0; i < 2 * n - 1; i++)
        {
            for (int j = 0; j < (Math.abs(n - 1 - i)); j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - Math.abs(n - 1 - i)) - 1; j++)
            {
                System.out.print(cnt++);
            }
            System.out.print("\n");

        }
    }
}
