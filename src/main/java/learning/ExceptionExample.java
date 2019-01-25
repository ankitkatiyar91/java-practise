package learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample
{
    public static void main(String[] args)
    {
        ExceptionExample example = new ExceptionExample();

        example.resourceTryBlock();

        System.out.println("You will return from: " + example.example1());

        System.out.println("You will return from Exit: " + example.exampleWithExit());
    }

    void resourceTryBlock()
    {

        try (BufferedReader reader = new BufferedReader(new FileReader("a.txt")))
        {
            System.out.println("Read:" + reader.readLine());
            System.out.println("Read:" + reader.readLine());
        }
        catch (IOException e)
        {	
            e.printStackTrace();
        }

    }

    String example1()
    {
        try
        {
            if (1 == 1)
            {
                throw new Exception();
            }
            return "TRY";
        }
        catch (Exception e)
        {
            return "CATCH";
        }
        finally
        {
            return "FINALLY";
        }
    }

    String exampleWithExit()
    {
        try
        {
            if (1 == 1)
            {
                throw new Exception();
            }
            return "TRY";
        }
        catch (Exception e)
        {
            System.exit(1);
            return "CATCH";
        }
        finally
        {
            return "FINALLY";
        }
    }
}
