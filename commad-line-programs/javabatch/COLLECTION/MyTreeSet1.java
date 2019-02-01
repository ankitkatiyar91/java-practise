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
/*
public int compareTo(Object o)
{
Student s=(Student)o;
return name.compareTo(s.name);
}
public int compareTo(Object o)
{
Student s=(Student)o;
return course.compareTo(s.course);
}
public int compareTo(Object o)
{
Student s=(Student)o;
return fee-s.fee;
}*/
public void show()
{
System.out.println(name+"\t"+course+"\t"+fee);
}
}

class NameComparator implements Comparator
{
public int compare(Object a,Object b)
{
Student s1=(Student)a;
Student s2=(Student)b;
return s1.name.compareTo(s2.name);
}
}

class CourseComparator implements Comparator
{
public int compare(Object a,Object b)
{
Student s1=(Student)a;
Student s2=(Student)b;
return s1.course.compareTo(s2.course);
}
}

class FeeComparator implements Comparator
{
public int compare(Object a,Object b)
{
Student s1=(Student)a;
Student s2=(Student)b;
return s1.fee-s2.fee;
}
}

class MyTreeSet
{
public static void main(String ar[])
{
CourseComparator n=new CourseComparator();
TreeSet hs=new TreeSet(n);
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
Student temp=new Student("Rajiv","java",9000);
System.out.println("Details of student to be searched in the tree set ...");
temp.show();
System.out.println("Result of searching "+hs.contains(temp));
}
}


