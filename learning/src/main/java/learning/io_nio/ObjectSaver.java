package learning.io_nio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSaver
{

    public static void main(String[] args)
    {
        try
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("employees")));

            objectOutputStream.writeObject(new User(1, "Ankit"));
            objectOutputStream.writeObject(new User(2, "Sachin"));

            objectOutputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
