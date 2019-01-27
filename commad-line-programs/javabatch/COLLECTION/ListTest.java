import java.util.*;

class ListTest
{
public static void main(String ar[])
{
ArrayList list=new ArrayList();
list.add("Aman");
list.add("Sachin");
list.add("Ravi");
list.add(1,"Swarnim");
list.add("Aditya");
list.add(4,"Sachin");
//System.out.println(list);
System.out.println("There are "+list.size()+" elements in the arraylist...");
System.out.println("Contents of arraylist......:");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("removing Aman from the list...");
list.remove("Aman");
System.out.println("Now Contents of arraylist......:");
ListIterator itr1=list.listIterator(list.size());
while(itr1.hasPrevious())
{
System.out.println(itr1.previous());
}
System.out.println("index of sachin in the list :"+list.indexOf("Sachin")+" and "+list.lastIndexOf("Sachin"));
System.out.println("Result of Searching Aditya in list :"+list.contains("Aditya"));
System.out.println("Result of searching Aman in list is :"+list.contains("Aman"));
}
}
