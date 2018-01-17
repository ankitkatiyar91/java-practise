package learning;

@FunctionalInterface
public interface MyFunctionalInterface
{

    public int sum(int a, int b);

    public default int mul(int a, int b)
    {
        return a + b;
    }

    public static int div(int a, int b)
    {
        return a + b;
    }
}

class MyFunctionalInterfaceTest
{
    public static void main(String[] args)
    {
        
    }
}