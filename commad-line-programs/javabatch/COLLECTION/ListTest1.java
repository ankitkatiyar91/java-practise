import java.util.*;

class Student
{
String name,course;
int fee;
public Student(String n,String c,int f)
{
name=n;
course=c;
fee=f;
}
public boolean equals(Object o)
{
Student s=(Student)o;
return name.equals(s.name)&&course.equals(s.course)&&fee==(s.fee);
}

public void show()
{
System.out.println(name+"\t"+course+"\t"+fee);
}
}

class ListTest1
{
public static void main(String ar[])
{
ArrayList list=new ArrayList();
list.add(new Student("Aman","java",8000));
list.add(new Student("Amit","PHP",6000));
list.add(new Student("Ankur","java",8000));
list.add(1,new Student("Deepak",".net",8000));
list.add(new Student("Ashish","C/C++",4000));
list.add(4,new Student("Aman","java",8000));
//System.out.println(list);
System.out.println("There are "+list.size()+" elements in the arraylist...");
System.out.println("Contents of arraylist......:");
Iterator itr=list.iterator();
while(itr.hasNext())
{
Student s=(Student)itr.next();
s.show();
}
System.out.println("Searching following element in the list...");
Student tmp=new Student("Ankur","java",8000);
tmp.show();
System.out.println("Result of Searching "+list.contains(tmp));
}
}
