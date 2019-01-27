import java.util.*;

class TokenTest
{
public static void main(String ar[])
{
String s="This,is$a.tokened String";
StringTokenizer st=new StringTokenizer(s,",$. ");
while(st.hasMoreTokens())
System.out.println(st.nextToken());
}
}