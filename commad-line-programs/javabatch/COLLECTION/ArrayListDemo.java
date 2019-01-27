import java.util.*;

class ArrayListDemo
{
public static void main(String ar[])
{
ArrayList list=new ArrayList();
//System.out.println("Default capacity of //arraylist is: "+list.capacity());
for(int i=1;i<15;i++)
list.add(new Integer(i));
System.out.println("Contents of array list..");
Iterator itr=list.iterator();
while(itr.hasNext())
System.out.println(itr.next());
}
}