package learning.io_nio;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExample
{

    private static final String TEMP_LOC = "D:\\temp\\";

    public static void main(String[] args)
    {
        try
        {
            File f = new File(TEMP_LOC + "a.txt");

            f.setExecutable(true);
            f.setWritable(true);
            f.setReadable(true);

            if (!f.exists())
            {
                f.createNewFile();
            }
            System.out.println("Exist: " + f.exists());
            System.out.println("Write access: " + f.canWrite());
            System.out.println("Path: " + f.getAbsolutePath());
            System.out.println("Hidden:" + f.isHidden());

            if (f.canWrite())
            {

                PrintWriter printWriter = new PrintWriter(f);
                printWriter.append("sajkhfjkafhjkdhkghdfkjghfd");
                // printWriter.println();
                printWriter.flush();
                printWriter.close();

                System.out.println("File write complete");

                Scanner scanner = new Scanner(f);
                System.out.println("Content of file:");
                while (scanner.hasNext())
                {
                    System.out.println(scanner.next());
                }
                scanner.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
