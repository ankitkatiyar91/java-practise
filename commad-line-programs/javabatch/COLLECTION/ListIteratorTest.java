import java.util.*;

class ListIteratorTest
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
System.out.println("There are "+list.size()+" elements in the arraylist...");
System.out.println("Contents of arraylist......:");
ListIterator itr=list.listIterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("Contents of ArrayList in reverse order....");
itr=list.listIterator(list.size());
while(itr.hasPrevious())
{
System.out.println(itr.previous());
}

}
}
