package collection.list;

import java.util.Iterator;

public class MyLinkListTest {

	public static void main(String[] args) {
		MyList<Integer> list = new MyList<Integer>();
		list.setData(1);
		list.setNextElement(new MyList<Integer>(new MyList<Integer>(
				new MyList<Integer>(null, 4), 3), 2));

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
