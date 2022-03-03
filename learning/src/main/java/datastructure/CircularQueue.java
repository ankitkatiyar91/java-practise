package datastructure;

import java.util.LinkedList;

public class CircularQueue {

    public static void main(String[] args) {
        CQueue<String> stringCQueue = new CQueue<>();
        stringCQueue.add("A");
        stringCQueue.add("B");
        System.out.println(stringCQueue.get());
        System.out.println(stringCQueue.get());
    }
}


class CQueue<T> {
    private LinkedList<T> items = new LinkedList<T>();

    public void add(T item) {
        items.add(item);
    }

    public T get() {
//        getFirst is O(1) as LinkedList maintain the pointer to last and first element.
        T first = items.getFirst();
        items.remove(0);
        return first;
    }
}