package concurrent;

import java.util.Date;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	/**
	 * @param args
	 */
	private static final Semaphore semaphore = new Semaphore(1, true);

	public static void main(String[] args) {
		System.out.println("Created a semaphore object with value: " + semaphore.availablePermits());
		SemaphoreGetter s = new SemaphoreGetter();
		s.setName("First");
		SemaphoreGetter s1 = new SemaphoreGetter();
		s1.setName("Second");
		new Thread(s, "First").start();
		new Thread(s1, "Second").start();
	}

	public static void getSemaphore() throws InterruptedException {
		System.err.println(Thread.currentThread().getName() + " Waiting thread " + semaphore.getQueueLength());
		semaphore.acquire();
	}

	public static void releaseSemaphore() {
		semaphore.release();
	}

	static class SemaphoreGetter implements Runnable {

		private String name;

		@Override
		public void run() {
			for (;;) {
				System.out.println(name + " Getting semaphore-" + new Date());
				try {
					SemaphoreTest.getSemaphore();
					System.out.println(name + " Got semaphore-" + new Date());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + " Releasing semaphore-" + new Date() + " \n");
				SemaphoreTest.releaseSemaphore();
			}
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
