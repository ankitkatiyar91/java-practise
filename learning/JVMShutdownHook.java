package learning;

public class JVMShutdownHook
{

    public static void main(String[] args)
    {
        System.out.println("Main start... ");
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Finally shut down hook called");
            }
        });

        System.out.println("Main end....   ");
    }

}
