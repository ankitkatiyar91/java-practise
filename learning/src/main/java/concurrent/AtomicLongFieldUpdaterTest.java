package concurrent;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdaterTest {

	public static void main(String[] args) {
		AtomicLongFieldUpdater<LongField> updater = AtomicLongFieldUpdater.newUpdater(LongField.class, "count");
		LongField field = new LongField();
		System.out.println(updater.getAndDecrement(field));
		System.out.println(updater.get(field));
	}

}

class LongField {
	volatile long count = 10;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}