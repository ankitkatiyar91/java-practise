package concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

    /**
     * @param args
     */

    public static void main(String[] args) {
        final BlockingQueue<StringBuffer> queue = new ArrayBlockingQueue<>(1);

        Producer producer = new Producer();
        producer.setQueue(queue);

        Consumer consumer = new Consumer();
        consumer.setQueue(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }

}

class Producer implements Runnable {

    BlockingQueue<StringBuffer> queue;

    public void setQueue(BlockingQueue<StringBuffer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int id = 0;
        for (; ; ) {
            if (queue.isEmpty()) {
                queue.add(new StringBuffer("Producer Message " + id++));
                // put is also relevant in this scenario.
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

class Consumer implements Runnable {

    BlockingQueue<StringBuffer> queue;

    public void setQueue(BlockingQueue<StringBuffer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        for (; ; ) {
            try {

                System.out.println("Consumer Got- " + queue.take() + " AT " + System.nanoTime());
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
