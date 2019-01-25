package learning;

public class BinaryOperation
{

    private static final int AUTORENEW_NOT_SUPPORTED_BIT = 4;

    public static void main(String[] args)
    {
        for (Integer serviceSettings = 0; serviceSettings < 10; serviceSettings++)
        {
            System.out.println("When: " + serviceSettings + " Then: " + (!(serviceSettings != null &&
                    (serviceSettings & AUTORENEW_NOT_SUPPORTED_BIT) == AUTORENEW_NOT_SUPPORTED_BIT)));

        }
    }
}
