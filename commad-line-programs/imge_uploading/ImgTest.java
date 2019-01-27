public class ImgTest
 { 

public static void main(String [] args)
{
try
{
//int result = imageSave(String sourcePath, String destinationPath, String imgName);
String sourcePath = "km.jpg";
String destinationPath = "img/";
String thumbDestinationPath = "img/thumb/";
UniqueString us = new UniqueString();
Img img = new Img();
String newImgName = us.getString();
int result1 = img.imageSave(sourcePath, destinationPath, newImgName);
int result2 = img.imageRSave(sourcePath, thumbDestinationPath, newImgName,730,250);
int result = result1*result2;
System.out.println(""+result);
}
catch(Exception e)
{
System.out.println(e);
}
}
}