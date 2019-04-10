package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableTest {

	public static void main(String[] args) {
		Callable<String> myCallable = new MyCallable();
		List<Future<String>> futures = new ArrayList<Future<String>>();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		try {

			for (int i = 0; i < 10; i++) {
				futures.add(executorService.submit(myCallable));
			}

			executorService.awaitTermination(150, TimeUnit.MILLISECONDS);

			for (Future<String> future : futures) {
				try {
					System.out.println(future.get());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}

			System.out.println("Shutting down executor");

			executorService.shutdown();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class MyCallable implements Callable<String> {
	private volatile static int i = 0;

	@Override
	public String call() throws Exception {
		i++;
		if (i % 2 == 0) {

			System.out.println("MyCallable.call() " + i);
			Thread.sleep(10);
		}
		return "Executed " + i;
	}

}