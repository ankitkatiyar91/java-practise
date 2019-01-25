package learning;

public class StringBuilderExample
{
    public static void main(String[] args)
    {
        capacityTest();
    }

    private static void capacityTest()
    {
        StringBuilder bld = new StringBuilder();
        showSize(bld);
        bld = new StringBuilder("Ankit");
        showSize(bld);
    }

    private static void showSize(StringBuilder bld)
    {
        System.out.printf("Length: %d Capacity:%d (Capacity-Length):%d%n", bld.length(), bld.capacity(),
                (bld.capacity() - bld.length()));
    }
}
