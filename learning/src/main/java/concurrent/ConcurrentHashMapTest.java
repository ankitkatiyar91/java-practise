package concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapTest {

	public static void main(String[] args) throws InterruptedException {
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(10, 10, 10);

		Runnable t = () -> {
			String name = String.valueOf(Math.random());
			for (int i = 0; i < 3; i++) {
				concurrentHashMap.put(name + i, "Test-" + i);

			}
		};

		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 5; i++) {
			executor.execute(t);
		}
		executor.awaitTermination(10, TimeUnit.SECONDS);
		executor.shutdown();

		System.out.println("####### Printing #########");
		for (Map.Entry<String, String> s : concurrentHashMap.entrySet()) {
			System.out.println(s.getKey() + " : " + s.getValue());
			concurrentHashMap.put("Extra--"+Math.random(), "ssd");
		}
		System.out.println("########### Print finish ##########");
		for (Map.Entry<String, String> s : concurrentHashMap.entrySet()) {
			System.out.println(s.getKey() + " : " + s.getValue());
		}
	}

}
