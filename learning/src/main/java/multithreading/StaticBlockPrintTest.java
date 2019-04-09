package multithreading;

import java.util.concurrent.CountDownLatch;

public class StaticBlockPrintTest {
	private static String msg = "HCL";
	static {
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out
						.println("\nStaticBlockPrintTest.{...}.new Runnable() {...}.run()"+Thread.currentThread().getPriority());
				msg = "Technologies ";
			}
		});
		t.start();
	}

	public static void main(String[] args) {
		System.out.println(msg+Thread.currentThread().getPriority());
		Runtime.getRuntime().gc();
		/**
		 * CounDownLatch Waits until provided number of threads are not executed
		 */
		CountDownLatch latch=new CountDownLatch(2);
		try {
			latch.countDown();
			latch.countDown();
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s="Sssss";
		
		
	}
	
	
}