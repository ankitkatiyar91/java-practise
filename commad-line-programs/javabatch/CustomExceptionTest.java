class MyException extends Exception
{

public MyException()
{
super();
}

public MyException(String m)
{
super(m);
}

}

class CustomExceptionTest
{
public static void main(String ar[])
{
try
{
throw(new MyException("Gender can be either m/f"));
}
catch(Exception e)
{
System.out.println(e);
}
}
}

