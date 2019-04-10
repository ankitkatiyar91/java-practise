package concurrent;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class CyclicBarrierInterruptionTest {

	public static void main(String[] args) {

		AtomicInteger num = new AtomicInteger();
		int parties = 4;
		CyclicBarrier barrier = new CyclicBarrier(parties);

		Runnable runnable = () -> {

			try {
				Thread.sleep(1000);
				int in = num.incrementAndGet();
				System.out.println("I am waiting at barrier-" + in);
				barrier.await();
				System.out.println("Yupieee got out of it-" + in);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();

		Thread t = new Thread(() -> {

			try {
				int in = num.incrementAndGet();
				System.out.println("I am waiting at barrier without sleep");
				barrier.await();
				System.out.println("Yupieee got out of it-" + in);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t.start();
		t.interrupt();

	}

}
