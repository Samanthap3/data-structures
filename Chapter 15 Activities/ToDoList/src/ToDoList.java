import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
/**
 * Implement a to do list. Tasks have a priority between 
 * 1 and 9 (with 1 being most urgent), and a description.
 * When the user enters the command 'add priority description', 
 * the program adds a new task. When the user enters next, 
 * the program removes and prints the most urgent task. 
 * The quit command quits the program. 
 * Use a priority queue in your solution.
*/
public class ToDoList
{
    // Instance variable(s)
    Queue<Task> toDoList;

    /**
     * Constructor
    */
    public ToDoList()
    {
        // Complete this
        toDoList = new PriorityQueue<>();

    }

    /**
     * Display a menu and accepts commands.
     */
    public void run()
    {
        String option = "";
        System.out.println("To Do List - Please enter an option");
        System.out.println("     add priority description (add a new task)");
        System.out.println("     next (remove and print most urgent task)");
        System.out.println("     quit (exit this program)");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        
        do
        {
            System.out.print("> ");
            option = in.nextLine();
            if (option.startsWith("add"))
            {
                addTask(option);
            } else if (option.equals("next"))
            {
                nextTask();
            }
        } 
        while (! option.equals("quit"));
    }
    
    /**
     * Parse the add option line.
     *
     * @param optionStr the option line
    */
    public void addTask(String optionStr)
    {
        // Complete this method
        String currentTask = optionStr.substring(optionStr.indexOf(" ")+1);
        System.out.println(currentTask.substring(0,currentTask.indexOf(" ")));
        
        //System.out.println((int)currentTask.charAt(0));
        if((int)currentTask.charAt(0) > 48 && (int)currentTask.charAt(0) < 58)
        {
            int priority = Integer.parseInt(currentTask.substring(0,1));
            currentTask = currentTask.substring(currentTask.indexOf(" "));
            toDoList.add(new Task(priority, currentTask));
        }  
        else
            System.out.println("The priority must be an integer between 1 and 9.");
            
    }

    /**
     * Get the next highest priority task and
     * display the description to the user.
    */
    public void nextTask()
    {
        Task next = null;
        // Complete this method
        //System.out.println(toDoList);

        next = toDoList.peek();
        
        
        if (next == null)
        {
            System.out.println("There are no tasks in the list.");
        } else
        {
            toDoList.remove();
            System.out.println(next.getDescription());
        }
    }
}