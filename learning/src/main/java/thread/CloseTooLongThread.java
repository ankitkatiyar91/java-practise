package thread;

import java.util.Date;

public class CloseTooLongThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TooLongThread tooLong=new TooLongThread();
		Thread thread;
		while(true){
			showStats();
			System.out.println("Thread started");
			thread=new Thread(tooLong);
			thread.start();
			System.out.println("Main goes to sleep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main wakes up");
			if(thread.isAlive()){
				System.out.println("Thread got interupted");
				thread=null;
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
class TooLongThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is sleeping");
		// Thread.sleep(5000);
		long i = 0;
		while (i < 10000000000L) {
			i++;
		}
		System.out.println("Thread Wake up");
	}
	
}