package learning;

public class FinalExample
{

    final static MyValue INTEGER = new MyValue(10);
    final static int k = 10;
    final int j;

    public FinalExample()
    {
       // j = 0;
        this(0);

    }
    
    public FinalExample(int k)
    {
        j = k;

    }

    public static void main(String[] args)
    {
        MyValue a = INTEGER;
        int k1 = k;
        System.out.println("INTEGER:" + INTEGER);
        System.out.println("A:" + a);
        System.out.println("k:" + k);
        System.out.println("k1:" + k1);

        a.set(11);
        k1 = 11;
        System.out.println("INTEGER:" + INTEGER);
        System.out.println("A:" + a);
        System.out.println("k:" + k);
        System.out.println("k1:" + k1);

        int[] ar = new int[2];
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = i + 1;
        }
        printArray("Original:", ar);
        changeArray(ar[1]);
        printArray("Updated:", ar);
    }

    private static void printArray(String message, int[] ar)
    {

        System.out.print(message);
        for (int j : ar)
        {
            System.out.print(j + ",");
        }
        System.out.println();

    }

    private static void changeArray(int i)
    {
        i = 9;
    }
}

class MyValue
{
    private int i;

    public MyValue(int k)
    {
        i = k;
    }

    public void set(int k)
    {
        i = k;

    }

    @Override
    public String toString()
    {
        return "" + i;
    }

}
