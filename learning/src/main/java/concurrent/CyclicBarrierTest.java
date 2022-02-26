package concurrent;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class CyclicBarrierTest {
	public static void main(String[] args) {
		AtomicInteger num = new AtomicInteger();
		int parties = 2;
		CyclicBarrier barrier = new CyclicBarrier(parties);

		Runnable runnable = () -> {

			try {
				Thread.sleep(1000);
				int in=num.incrementAndGet();
				System.out.println("I am waiting at barrier-"+in);
				barrier.await();
				System.out.println("Yupieee got out of it-"+in);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};

		new Thread(runnable).start();
		new Thread(runnable).start();
		// Same can be repeated for two more threads. Barrier will reset and work again
		new Thread(runnable).start();
		new Thread(runnable).start();

	}

}
