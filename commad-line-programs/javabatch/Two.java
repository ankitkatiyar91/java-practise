class One
{
static String s1="java";
}

class Two
{
static String s2="java";
public static void main(String ar[])
{
String s3="java";
String s4="ja"+"va";
String s6=new String("ja")+"va";

String s5=new String("java");
System.out.println(One.s1==s2);
System.out.println(s2==s3);
System.out.println(s3==s4);
System.out.println(s4==s5);
System.out.println(One.s1==s5);
System.out.println((One.s1).equals(s5));
}
}
