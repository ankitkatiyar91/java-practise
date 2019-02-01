package learning;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        final int size = 10;

        int[] series = new int[size];
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i < size; i++)
        {
            series[i] = series[i - 1] + series[i - 2];
        }
        System.out.print("Series:");
        for (int i : series)
        {
            System.out.print(i + ",");
        }
    }
}
