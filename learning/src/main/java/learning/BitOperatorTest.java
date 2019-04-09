package learning;

import java.lang.reflect.Modifier;

public class BitOperatorTest
{
    public static void main(String[] args)
    {
        // int i = 00000001;
        // int j = 11111110;
        // System.out.println(~i);
        // System.out.println(j);
        // int p = 28921;
        // long k = p * 9;
        // search: System.out.println("Processor:" + Runtime.getRuntime().availableProcessors());
        // search:
        // ;
        // search: for (int i2 = 0; i2 < 5; i2++)
        // {
        // for (int k2 = 0; k2 < 5; k2++)
        // {
        // System.out.print(k2);
        // if (k2 == 3)
        // {
        // break search;
        // }
        // }
        // System.out.println();
        // }
        System.out.println(Modifier.isFinal(Modifier.FINAL & ~Modifier.FINAL));
        new BitOperatorTest().test();
    }

    private void test()
    {

        show(1);
        show(10000000000L);
        show(1.0);
    }

    private void show(int i)
    {
        System.out.println("BitOperatorTest.show() int");

    }

    private void show(long i)
    {
        System.out.println("BitOperatorTest.show() long");

    }

    private void show(float i)
    {
        System.out.println("BitOperatorTest.show() float");

    }

    private void show(double i)
    {
        System.out.println("BitOperatorTest.show() double");

    }
}
