package learning;

public class BinaryOperation
{

    private static final int SUPPORTED_BIT = 4;

    public static void main(String[] args)
    {
        for (Integer serviceSettings = 0; serviceSettings < 10; serviceSettings++)
        {
            System.out.println("When: " + serviceSettings + " Then: " + (!(serviceSettings != null &&
                    (serviceSettings & SUPPORTED_BIT) == SUPPORTED_BIT)));

        }
    }
}
