package learning;

public class InnerClassExample
{
    static int k = 10;
    
    {
        System.out.print(k);
    }

    static class K
    {
        static int i = 0;
    }

    class K2
    {
        static final int i = 0;
    }
}
