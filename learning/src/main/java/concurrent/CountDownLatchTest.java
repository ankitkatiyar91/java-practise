package concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CountDownLatchTest {
	public static void main(String[] args) {
		AtomicInteger num = new AtomicInteger();
		int count = 3;
		CountDownLatch latch = new CountDownLatch(count);

		Runnable countDownWorker = () -> {
			try {
				Thread.sleep(1000);
				int in = num.incrementAndGet();
				System.out.println("Sending a signal of done-" + in);
				latch.countDown();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		new Thread(countDownWorker).start();
		new Thread(countDownWorker).start();
		new Thread(countDownWorker).start();
		new Thread(() -> {
			try {
				System.out.println("I am waiting for workers to complete");
				latch.await();
				System.out.println("Recieved a signal to got ahead");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();

		// adding extra worker, We will notice that thread will not wait for these
		// worker to finish
		new Thread(countDownWorker).start();
		new Thread(countDownWorker).start();
	}

}
