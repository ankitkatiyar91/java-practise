class Aa
{
static
{
System.out.println("Class Aa is loaded...");
}
}

class Bb
{
static
{
System.out.println("Class Bb is loaded...");
}
}

class C
{
static
{
System.out.println("Class C is loaded...");
}
public static void main(String ar[])
{
try
{
System.out.println("explicitly loading class : "+ar[0]);
Class.forName(ar[0]);
}catch(Exception e)
{
e.printStackTrace();
}
}
}
