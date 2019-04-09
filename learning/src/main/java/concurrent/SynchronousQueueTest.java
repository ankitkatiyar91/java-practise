package concurrent;

import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueTest {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		final BlockingQueue<StringBuffer> queue = new SynchronousQueue<StringBuffer>();

		SyncProducer producer = new SyncProducer();
		producer.setQueue(queue);

		SyncConsumer consumer = new SyncConsumer();
		consumer.setQueue(queue);

		new Thread(producer).start();
		new Thread(consumer).start();
	}

}

class SyncProducer implements Runnable {

	BlockingQueue<StringBuffer> queue;

	public void setQueue(BlockingQueue<StringBuffer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for (;;) {
			if (queue.isEmpty()) {
				try {
					queue.add(new StringBuffer("Producer Message " + new Date()));
					Thread.sleep(1000);
				} catch (Exception e) {	}
				
			}
		}

	}

}

class SyncConsumer implements Runnable {

	BlockingQueue<StringBuffer> queue;

	public void setQueue(BlockingQueue<StringBuffer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		for (;;) {
			try {
				System.out.println("Consumer Going to read "+new Date());
				System.out.println("Consumer Got- " + queue.take() + " AT " + new Date());
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
