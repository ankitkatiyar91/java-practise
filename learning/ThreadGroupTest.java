package learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadGroupTest
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try
        {
            Thread.sleep(12000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++)
        {
            executorService.execute(new ThreadGroupTestRunnable());
        }

        Runnable runnable = new ThreadGroupTestRunnable();

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);

        executorService.shutdown();

    }
}

class ThreadGroupTestRunnable implements Runnable
{
    private static AtomicInteger i = new AtomicInteger(1);

    @Override
    public void run()
    {
        System.out.println("Task:" + i.getAndAdd(1) + " Thread:" + Thread.currentThread().getName());

        for (int i = 0; i < 99999999999999L; i++)
        {

            long k = 29321302109321L;
        }
    }
}