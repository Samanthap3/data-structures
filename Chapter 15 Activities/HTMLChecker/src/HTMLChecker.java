import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample3.html";
        Stack<String> tags = new Stack<>();
        Stack<String> endTags = new Stack<>();

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            while(in.hasNext())//populate stack
            {
                String current = in.next();
                tags.push(current);
            }

            while(tags.size() >0)
            {
                if(tags.peek().contains("/"))
                {
                    endTags.push(tags.pop());//pushes closing tags onto new stack
                }
                //compares the letters if the most recent end and start tag match
                else if(tags.peek().substring(1).equals(endTags.peek().substring(2)))
                {
                    tags.pop();
                    endTags.pop();
                }
                else
                {
                    System.out.print("Not Proper");
                    break; 
                }
            }
            

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
