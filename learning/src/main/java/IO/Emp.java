import java.io.*;

class Emp implements Serializable
{
String name;
transient String job;
int salary;
public Emp(String n,String j,int s)
{
name=n;
job=j;
salary=s;
}
public void display()
{
System.out.println(name+"\t"+job+"\t"+salary);
}
}