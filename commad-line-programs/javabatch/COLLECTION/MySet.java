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

public int hashCode()
{
return name.hashCode()+course.hashCode()+fee;
}

public boolean equals(Object o)
{
Student s=(Student)o;
return name.equals(s.name)&&course.equals(s.course)&&fee==s.fee;
}

public void show()
{
System.out.println(name+"\t"+course+"\t"+fee);
}
}



class MySet
{
public static void main(String ar[])
{
TreeSet hs=new TreeSet();
hs.add(new Student("Raj","Java",10000));
hs.add(new Student("Amit","Java",8000));
hs.add(new Student("Sachin",".net",10000));
hs.add(new Student("Rajiv","Java",9000));
hs.add(new Student("Deepak",".net",8000));

System.out.println("Contents of Tree Set...");
Iterator itr=hs.iterator();
while(itr.hasNext())
{
Student s=(Student)itr.next();
s.show();
}
Student temp=new Student("Deepak",".net",8000);
System.out.println("Details of student to be searched in the Hash set ...");
temp.show();
System.out.println("Result of searching "+hs.contains(temp));
}
}


