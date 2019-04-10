package collection.list;

import java.util.Iterator;

public class MyLinkListTest {

	public static void main(String[] args) {
		MyLinkList<Integer> list = new MyLinkList<Integer>();
		list.setData(1);
		list.setNextElement(new MyLinkList<Integer>(new MyLinkList<Integer>(
				new MyLinkList<Integer>(null, 4), 3), 2));

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Data-" + iterator.next());
		}
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%  Phase 2  %%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Data-" + iterator.next());
		}
	}
}
