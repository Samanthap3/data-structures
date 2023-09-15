import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> startIterator = strings.listIterator();
        ListIterator<String> endIterator = strings.listIterator(strings.size());
        String current;
        while(startIterator.hasNext())
        {
           current  = startIterator.next();
           startIterator.remove();
           if(endIterator.hasNext() == false)
           {
            endIterator.add(current);
            }
        }
    }
}