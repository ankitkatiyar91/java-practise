package collection.list;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {

	private MyList<T> nextElement;
	private T data;

	public MyList() {
		super();
	}

	public MyList(MyList<T> nextElement, T data) {
		super();
		this.nextElement = nextElement;
		this.data = data;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			MyList<T> next = MyList.this;

			@Override
			public boolean hasNext() {
				return next != null;
			}

			@Override
			public T next() {
				T d = (T) next.data;
				next = next.nextElement;
				return d;
			}
		};
	}

	public MyList<T> getNextElement() {
		return nextElement;
	}

	public void setNextElement(MyList<T> nextElement) {
		this.nextElement = nextElement;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MyList<T> add(MyList<T> l) {
		return this.nextElement = l;
	}

}
