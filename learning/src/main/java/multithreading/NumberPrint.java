package multithreading;

public class NumberPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Even even = new Even();
		Odd odd = new Odd();
		Number number=new Number();
		even.number=number;
		odd.number=number;
		Thread evenThread = new Thread(even);
		Thread oddThread = new Thread(odd);
		oddThread.start();
		evenThread.start();
	}

}

class Even implements Runnable {
	public Number number;

	@Override
	public void run() {
		synchronized (number) {
			while (number.getI() <= 100) {
				try {
					System.out.println("Even->"+number.getI());
					number.increment();
					number.notifyAll();
					number.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}

	}

}

class Odd implements Runnable {
	public Number number;

	@Override
	public void run() {
		synchronized (number) {
			while (number.getI() <= 100) {
				try {
					System.out.println("Odd->"+number.getI());
					number.increment();
					number.notifyAll();
					number.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		
	}
}

class Number {
	private int i = 1;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void increment() {
		i++;
	}
}