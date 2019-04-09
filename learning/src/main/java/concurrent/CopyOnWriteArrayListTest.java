package concurrent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
		
		
		Viewer viewer=new Viewer();
		viewer.setList(list);		
		Thread t1=new Thread(viewer);
		
		Adder adder=new Adder();
		adder.setList(list);
		
		Thread t=new Thread(adder);
		t.start();
		t1.start();
		
	}

	static class Adder implements Runnable{

		private List<Integer> list;
		public void setList(List<Integer> list) {
			this.list = list;
		}
		@Override
		public void run() {
			for(int i=0;i<100;i++){
				list.add(i);
				System.out.println("Added-"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	static class Viewer implements Runnable{

		private List<Integer> list;
		public void setList(List<Integer> list) {
			this.list = list;
		}
		@Override
		public void run() {
			while (true) {
				System.out.println("Length of list->"+list.size());
				for (Integer i : list) {
					System.out.println("Reading-"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		
	}
}
