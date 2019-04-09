package com.concurrent;

import java.util.Date;

public class ThreadLocalTest {

	/**
	 * @param args
	 */
	private static final ThreadLocal<String> threadLocal=new ThreadLocal<String>();
	
	public static void main(String[] args) {
		System.out.println("ThreadLocalTest.main()");
		ThreadLocalGetter s=new ThreadLocalGetter();
		s.setName("First");
		ThreadLocalGetter s1=new ThreadLocalGetter();
		s1.setName("Second");
		new Thread(s).start();
		new Thread(s1).start();
	}

	public static String getMessage() throws InterruptedException {
		return threadLocal.get();
	}
	
	public static void releaseMessage(String msg) {
		threadLocal.set(msg);
	}
	
	static class ThreadLocalGetter implements Runnable{

		private String name;
		@Override
		public void run() {
		for(;;){
			System.out.println(name+" Getting Thread Local-"+new Date());
			try {
				String s=ThreadLocalTest.getMessage();
				System.out.println(name+" Got Thread Local-"+s+" "+new Date());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+" Releasing Thread Local-"+new Date()+" \n");
			ThreadLocalTest.releaseMessage(name+" Done now leaving ");
		}
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
