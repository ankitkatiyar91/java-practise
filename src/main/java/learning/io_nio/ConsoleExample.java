package learning.io_nio;

import java.io.Console;

/**
 * Example of a Console Application
 * @author Ankit Katiyar
 *
 */
public class ConsoleExample
{
    public static void main(String[] args)
    {
        Console console = System.console();
        if (console == null)
        {
            System.err.println("No console.");
            System.exit(1);
        }
        String username = console.readLine("Enter username:");
        char[] password = console.readPassword("Enter your password:");
        if (username.equals(new String(password)))
        {
            console.writer().append("Logged in successfully");
        }
        else
        {
            console.writer().append("Invalid username or password");
        }

        console.flush();
    }
}
