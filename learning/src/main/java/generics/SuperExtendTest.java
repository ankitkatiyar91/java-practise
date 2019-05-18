package generics;

import java.util.ArrayList;

public class SuperExtendTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	public void test() throws Exception {
		ArrayList<Parent> parents=new ArrayList<>();
		parents.add(new Parent());
		parents.add(new Child());
		//parents.add(new GrandParent()); Not allowed

		ArrayList<Parent> p=new ArrayList<>();
		ArrayList<Child> c=new ArrayList<>();
		ArrayList<GrandParent> gp=new ArrayList<>();
		
		testExtendP(p);
		//testExtendP(c); Not allowed only super type allowed no child
		testExtendP(gp);
		
		testExtends(c);
		testExtends(p);
		//testExtends(gp); Not allowed because GrantParent does not extends Parent
	}
	
	/**
	 * This Method allow get operations for Parent<br> 
	 * No add because it define a upper bound to which it can be Cast<br>
	 *  		<br>OR<br>
	 *  This is read-only because there is no way to determine the exact type to add to the collection (the parameter could be List<B> and there would be no way of ensure the type safety of an addition<br>
	 *  <br>
	 *  you don't know if the list passed as parameter is typed to the class Child, Parent or GrandParent.<br>
	 */
	public void testExtends(ArrayList<? extends Parent> list) throws Exception {
	/*	list.add(new Child());
		list.add(new Parent());
		list.add(new GrandParent());
		// can not add
		*/
		Child c=(Child) list.get(0);
		Parent parent=list.get(0);
		GrandParent gp=list.get(0);
		/**
		 * Unsafe collection way
		 */
		ArrayList list2=new ArrayList();
		list.addAll(list2);
	}
	
	/**
	 * This Method allowed add operations for Parent and it's sub types and on get it gives Object type 
	 * 
	 */
	public void testExtendP(ArrayList<? super Parent> list) throws Exception {
		list.add(new Child());
		list.add(new Parent());
		//list.add(new GrandParent());
		/*can not add because GrandParent can not be converted to Parent type
		 * 
		 * The method add(capture#3-of ? super Parent) in the type ArrayList<capture#3-of ? super Parent> is not applicable for the arguments (GrandParent)
		 * 
		 */
		
		Child c=(Child) list.get(0);
		Parent parent=(Parent) list.get(0);
		GrandParent gp=(GrandParent) list.get(0);
		Object obj=list.get(0);
		
		/**
		 * Unsafe collection way
		 */
		ArrayList list2=new ArrayList();
		list.addAll(list2);
	}
	
	/**
	 * This Method allowed all operations for Parent and it's sub types 
	 * 
	 */
	public void testDirect(ArrayList<Parent> list) throws Exception {
		list.add(new Child());
		list.add(new Parent());
		//list.add(new GrandParent()); 
		/*
		 * Can not add GrandParent (Normal generic rule)
		 */
	}

}
class GrandParent{
	
}

class Parent extends GrandParent{
	
}
class Child extends Parent{
	
}