import java.util.*;
import java.security.*;
import java.math.*;

public class UniqueString
{
public void uniquestring()
{
} 
public static String getString() throws Exception
{
Calendar calendar = new GregorianCalendar();
String am_pm,str = "";
int date = calendar.get(Calendar.DATE); 
int month = calendar.get(Calendar.MONTH);
int year = calendar.get(Calendar.YEAR);
int hour = calendar.get(Calendar.HOUR);
int minute = calendar.get(Calendar.MINUTE);
int second = calendar.get(Calendar.SECOND);
int msecond = calendar.get(Calendar.MILLISECOND);
if(calendar.get(Calendar.AM_PM) == 0)
am_pm = "AM";
else
am_pm = "PM";
str = date+""+month+""+year+"" + hour + "" + minute + "" + second + ""+msecond+"" + am_pm;
MessageDigest m=MessageDigest.getInstance("MD5");
m.update(str.getBytes(),0,str.length());
str = new BigInteger(1,m.digest()).toString(16);
return str;	
}
}
