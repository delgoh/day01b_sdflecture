package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Console cons = System.console();

        List<String> todos = new ArrayList<>();

        String input = "";
        while (!input.equals("quit")) {
            input = cons.readLine("Enter a string: ");
            if (!input.equals("quit"))
                todos.add(input);

            System.out.println("Current task list:");
            int index = 0;
            for (String todo: todos)
                System.out.println("Task " + (++index) + ": " + todo);
        }
    }
}
