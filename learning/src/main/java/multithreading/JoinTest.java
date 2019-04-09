package multithreading;

class MyThread extends Thread {
	public MyThread() {
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		System.out.println("child thread is started.....");
		for (int i = 1; i <= 10; i++)
			System.out.println("Child:" + i);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println("child thread is terminating....");
	}
}

class JoinTest {
	public static void main(String ar[]) {
		System.out.println("main started, starting child thread.......");
		MyThread th = new MyThread();
		System.out.println("suspending main thread till th thread completes or 5 seconds completes...");
		try {
			th.join();
		} catch (InterruptedException en) {
			System.out.println(en);
		}
		for (int i = 10; i > 0; i--) {
			System.out.println("Main: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("main thread is terminating...");
	}
}