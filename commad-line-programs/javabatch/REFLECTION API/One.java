class One
{
private String name;
private One(String s)
{
name=s;
System.out.println("private constructor is invoked..."+s);
}
private void display()
{
System.out.println("Hello.."+name);
}

}