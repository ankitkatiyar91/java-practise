package learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.StringTokenizer;
import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class SerializationTest extends Object
{
    private volatile String a;

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Address: "+InetAddress.getByName("172.217.25.110").getHostName());
            Person person = new Person(1, "Viru");
            File file = new File("persion_data.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(person);

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            System.out.println(inputStream.readObject());

            FileWriter fileWriter = new FileWriter(file);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }

    static class Person implements Serializable
    {
        private int id;
        private String name;

        public Person()
        {
            // TODO Auto-generated constructor stub
        }

        public Person(int id, String name)
        {
            super();
            this.id = id;
            this.name = name;
        }

        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "Person [id=" + id + ", name=" + name + "]";
        }

    }

}
