import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
 
public class Img
 { 

public void img()
{
}
/*
public static void main(String [] args)
{
try
{
//int result = imageSave(String sourcePath, String destinationPath, String imgName);
UniqueString us = new UniqueString();
String newImgName = us.getString();
int result = imageSave("load.GIF","img/", newImgName);
System.out.println(""+result);
}
catch(Exception e)
{
System.out.println(e);
}
}
*/
public static int imageSave(String sourcePath, String destinationPath, String imgName) throws IOException
{
BufferedImage originalImage = ImageIO.read(new File(sourcePath));
int type = imgType(originalImage);
String extension = imgExtension(type);
String destination = destinationPath+""+imgName+"."+extension;
ImageIO.write(originalImage, extension, new File(destination)); 
return 1;
}

public static int imageRSave(String sourcePath, String destinationPath, String imgName, int width, int height) throws IOException
{
BufferedImage originalImage = ImageIO.read(new File(sourcePath));
int type = imgType(originalImage);
String extension = imgExtension(type);
originalImage = resizeImage(originalImage, width, height, type); 
String destination = destinationPath+""+imgName+"."+extension;
ImageIO.write(originalImage, extension, new File(destination)); 
return 1;
}

public static int imgType(BufferedImage originalImage) throws IOException
{
int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
return type;
}

public static String imgExtension(int type)
{
String extension = "";
if(type == 2)
extension = "png";
else if(type == 5)
extension = "jpg";
else if(type ==12)
extension = "gif";
return extension;
}

public static BufferedImage resizeImage(BufferedImage originalImage, int IMG_WIDTH, int IMG_HEIGHT, int type) throws IOException
{
BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
Graphics2D g = resizedImage.createGraphics();
g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
g.dispose();
return resizedImage;
}

}
