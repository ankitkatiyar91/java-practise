package multithreading;

class ThreadOne extends Thread {
	public void run() {
		System.out.println("child thread started.....");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("child thread is terminating...");
	}

}

class DaemonTest {
	public static void main(String ar[]) {
		System.out.println("starting a normal child thread..");
		ThreadOne t = new ThreadOne();
		t.setDaemon(true);
		t.start();

		// Cannot set a thread daemon once started, It will throw exception: Exception in thread "main" java.lang.IllegalThreadStateException
//		t.setDaemon(true);
		try {
			System.out.println("suspending main()..");
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println("Exiting main...");
	}
}