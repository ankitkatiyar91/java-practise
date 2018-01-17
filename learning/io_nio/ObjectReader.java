package learning.io_nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader
{
    public static void main(String[] args)
    {
        try
        {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("employees")));
            System.out.println("Obj:-" + inputStream.readObject());
            System.out.println("Obj:-" + inputStream.readObject());
            inputStream.close();
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
