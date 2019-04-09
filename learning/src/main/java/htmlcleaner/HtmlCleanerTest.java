/**
 * 
 */
package com.htmlcleaner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

/**
 * @author ipg
 * 
 */
public class HtmlCleanerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		while (true) {
			new Thread(new Runnable() {

				@Override
				public void run() {

					CleanerProperties props = new CleanerProperties();

					// set some properties to non-default values
					props.setTranslateSpecialEntities(true);
					props.setTransResCharsToNCR(true);
					props.setOmitComments(true);

					try {
						log("Start Reading URL");
						
						String data=readThread(new URL("http://localhost:8080/TestingPages/"), 3000).toString();
						log("Reader read it all- Size of data was->"+data.length());
						TagNode baseResultNode = new HtmlCleaner(props).clean(data);
						log("Cleaner read it all- Size of data was->"+data.length());
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
				}
			}).start();

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			showStats();
		}

	
/*	try {
		log("Started reading");
		readThread(new URL("http://localhost:8080/TestingPages/"), 3000);
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}	*/
	}

	private static void log(String message) {
		System.out.println(new Date() + " - " + message);
	}

	public static void showStats() {
		System.out.println("\n" + new Date());
		System.out.println("Threads Count: " + Thread.currentThread().getThreadGroup().activeCount());
		System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory() / 1024.0 / 1024.0 + ", Total Memory: "
				+ Runtime.getRuntime().totalMemory() / 1024.0 / 1024.0 + ", Free Memory: " + Runtime.getRuntime().freeMemory() / 1024.0 / 1024.0);

		log("Threads Count: "
				+ Thread.currentThread().getThreadGroup().activeCount()
				+ "\n"
				+ ("Max Memory: " + Runtime.getRuntime().maxMemory() / 1024.0 / 1024.0 + ", Total Memory: " + Runtime.getRuntime().totalMemory()
						/ 1024.0 / 1024.0 + ", Free Memory: " + Runtime.getRuntime().freeMemory() / 1024.0 / 1024.0));

		Thread[] list = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(list);

		System.out.println("**************Active Threads***********");
		for (Thread thread : list) {
			System.out.println(thread.getName());
		}

	}

	static boolean done = false;
	private ExecutorService service;

	private static String read(final URL url, final long millis) {
		final StringBuffer buffer = new StringBuffer();
		Callable<Boolean> readCall = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				URLConnection con = url.openConnection();
				con.setConnectTimeout(2000);
				con.setReadTimeout(3000);
				InputStream in = con.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				int b=1;
				while (b!=-1) {
					b=reader.read();
					buffer.append(b);
				}
				log("Callable finised and returning "+buffer.length());
				return true;
			}

		};

		ExecutorService service = Executors.newSingleThreadExecutor();
		try {
			Future<Boolean> future = service.submit(readCall);
			log("Service started with time wound");
			boolean termination=service.awaitTermination(millis, TimeUnit.MILLISECONDS);
			log("Service wait end now get result termination->"+termination);
			Boolean done = future.get();
			log("Got result after read->" + done);
			if (!done) {
				log("It's not done so closing this task and ending up ");
				service.shutdown();
			} else {
				log("Read finished properly so output is " + buffer.length());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}finally{
			service.shutdown();
		}

		return buffer.toString();
	}

	private static StringBuffer readThread(final URL url,final long maxMilli) {
		final StringBuffer buffer = new StringBuffer();
		try {			
			final URLConnection con = url.openConnection();
			con.setConnectTimeout(2000);
			con.setReadTimeout(3000);
			long endMiilis=System.currentTimeMillis()+maxMilli;
			log("Read timeout "+maxMilli+"  endMiilis-"+endMiilis);
			
			Thread readerThread=new Thread() {
				public void run() {
					BufferedReader reader = null;
					try {
						reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					int b=1;

					while (b != -1) {
						if (!this.isInterrupted()) {
							try {
								b = reader.read();
							} catch (IOException e) {
								log("Exception handled by read() method catch");
								e.printStackTrace();
							}
							buffer.append(b);
						}else {
							log("Reading process got interuppetd so ending up");
							return;
						}
					}
					log("Thread read finised and returning "+buffer.length());
					done= true;
				}
			};
			readerThread.start();

			while (!done && (System.currentTimeMillis() < endMiilis)) {	
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
			
			log("Got done status "+done);
			if (!done) {
				log("It's not done so closing this task and ending up");
				readerThread.interrupt();
				buffer.delete(0, buffer.length());
			} else {
				log("Read finished properly so output is " + buffer.length());
			}
			showStats();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buffer;

	}
}