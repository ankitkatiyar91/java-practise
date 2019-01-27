package learning;

public class HandleUncaughtExceptions
{

    static Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler()
    {

        @Override
        public void uncaughtException(Thread t, Throwable e)
        {
            System.out.println("\n\nWowww Got issue from thread: " + t + " Exception:" + e);

        }
    };

    public static void main(String[] args)
    {
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                setName("Ankit");
                throw new NumberFormatException();
            }
        };

        t1.setUncaughtExceptionHandler(handler);
        t1.start();
    }
}
