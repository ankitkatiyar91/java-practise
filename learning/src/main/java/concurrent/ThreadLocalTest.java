package concurrent;

import java.util.Date;

public class ThreadLocalTest {

	/**
	 * @param args
	 */
	private static final ThreadLocal<String> threadLocal = new ThreadLocal<String>();

	public static void main(String[] args) {
		System.out.println("ThreadLocalTest.main()");
		ThreadLocalGetter s = new ThreadLocalGetter("First");
		ThreadLocalGetter s1 = new ThreadLocalGetter("Second");
		new Thread(s).start();
		new Thread(s1).start();
	}

	public static String getMessage() throws InterruptedException {
		return threadLocal.get();
	}

	public static void releaseMessage(String msg) {
		threadLocal.set(msg);
	}

	static class ThreadLocalGetter implements Runnable {

		private String name;

		@Override
		public void run() {
			for (int i = 0; i < 2; i++) {
				System.out.println(name + " Getting Thread Local-" + new Date());
				try {
					String s = ThreadLocalTest.getMessage();
					System.out.println(name + " Got Thread Local Message-" + s + " at " + new Date());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + " Releasing Thread Local-" + new Date() + " \n");
				ThreadLocalTest.releaseMessage(name + " Upadted message at:" + new Date());
			}
		}

		private ThreadLocalGetter(String name) {
			super();
			this.name = name;
		}

	}
}
