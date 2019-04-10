package multithreading;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CloseLongCallable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		TooLongCallable longThread=new TooLongCallable();
		int i=0;
		while (true) {
			Future<String> task = executorService.submit(longThread);
			try {
				showStats();
				i++;
				System.out.println(i+"Started->" + System.currentTimeMillis());
				System.out.println(i+"Got Output->" + task.get(1,TimeUnit.SECONDS));
				System.out.println(i+"Ended->" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}catch (TimeoutException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void showStats() {
		System.out.println("\n" + new Date());
		System.out.println("Threads Count: " + Thread.currentThread().getThreadGroup().activeCount());
		System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory() / 1024.0 / 1024.0 + ", Total Memory: "
				+ Runtime.getRuntime().totalMemory() / 1024.0 / 1024.0 + ", Free Memory: " + Runtime.getRuntime().freeMemory() / 1024.0 / 1024.0);
		
		/*
		 * Print Thread List alive
		 */

		Thread[] list = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(list);

		System.out.println("**************Active Threads***********");
		for (Thread thread : list) {
			System.out.println(thread.getName());
		}
	}

}

class TooLongCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("Going to sleep->"+System.currentTimeMillis());
		Thread.sleep(2000);
		System.out.println("Wake->"+System.currentTimeMillis());
		return "Execution completed";
	}
	
}
