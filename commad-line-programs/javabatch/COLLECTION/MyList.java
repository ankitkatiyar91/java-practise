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
return name.equals(s.name)&&course.equals(s.course)&&fee==s.fee;
}
public String toString()
{
return this.name+" "+this.course+" "+this.fee;
}
public void show()
{
System.out.println(name+"\t"+course+"\t"+fee);
}
}


class MyList
{
public static void main(String ar[])
{
ArrayList list=new ArrayList();
list.add(new Student("Raj","Java",10000));
list.add(new Student("Amit","Java",8000));
list.add(new Student("Sachin",".net",10000));
list.add(new Student("Rajiv","Java",9000));
list.add(new Student("Deepak",".net",8000));
System.out.println(list);
System.out.println("Contents of array list ....");
Iterator itr=list.iterator();
while(itr.hasNext())
{
Student s=(Student)itr.next();
s.show();
}

Student temp=new Student("Rajiv","Java",9000);
System.out.println("Details of student to be searched in the array list ...");
temp.show();
System.out.println("Result of searching "+list.contains(temp));
}
}



