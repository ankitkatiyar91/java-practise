package learning;

public class MethodParameterTest
{

    public static void main(String[] args)
    {
        StringBuffer i = new StringBuffer("start");
        System.out.println("Fresh: " + i);
        updateOnly(i);
        System.out.println("Updated: " + i);
        createNew(i);
        System.out.println("New: " + i);
    }

    private static void updateOnly(StringBuffer i)
    {
        i.append(" updated");

    }

    private static void createNew(StringBuffer i)
    {
        i = new StringBuffer("New");

    }

}
