package collection.list;

import java.util.Iterator;

public class MyLinkList<T> implements Iterable<T> {

	private MyLinkList<T> nextElement;
	private T data;

	public MyLinkList() {
		super();
	}

	public MyLinkList(MyLinkList<T> nextElement, T data) {
		super();
		this.nextElement = nextElement;
		this.data = data;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			MyLinkList<T> next = MyLinkList.this;

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

	public MyLinkList<T> getNextElement() {
		return nextElement;
	}

	public void setNextElement(MyLinkList<T> nextElement) {
		this.nextElement = nextElement;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MyLinkList<T> add(MyLinkList<T> l) {
		return this.nextElement = l;
	}

}
