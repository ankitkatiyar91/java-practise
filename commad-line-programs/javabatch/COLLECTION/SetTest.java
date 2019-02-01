import java.util.*;

class SetTest
{
public static void main(String ar[])
{

TreeSet ts=new TreeSet();
HashSet hs=new HashSet();
hs.add("Aman");
hs.add("Sachin");
hs.add("Ravi");
//hs.add(1,"Swarnim"); No such method in HashSet
hs.add("Swarnim");
hs.add("Aditya");
hs.add("Sachin");
System.out.println("There are "+hs.size()+" elements in the hashset...");
System.out.println("Contents of HashSet ....");
Iterator itr=hs.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("Result of searching Aman in hashset :"+hs.contains("Aman"));

ts.addAll(hs);
System.out.println("Contents of TreeSet....");
itr=ts.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("Result of searching Aman in hashset :"+ts.contains("Aman"));
} 
}