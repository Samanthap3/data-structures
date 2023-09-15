import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");

        // the list is currently: DHRT
        /*
         * The ListIterator method creates a new list iterator 
         * that is postioned at the head of the list.
         * the "|" is used to represent the iterator postition
         */
        ListIterator<String> iterator = staff.listIterator(); // |DHRT

        /*The next method advances the iterator to the next element in the list */
        iterator.next(); // D|HRT

        /* The next method also returns the element tha the iterator is passing */
        String name = iterator.next(); //DH|RT
        System.out.println(name);
        System.out.print("Expected: Harry");

        /* The add method for iterators inserts an element at the iterator position.
         * The iterator is then positioned after the element that was added.
         */
        iterator.add("Juliet"); // DHJ|RT
        iterator.add("Nina"); // DHJN|RT

        /* The remove method removes the element return by the last call to 
         * next or previous
         * The remove method can ONLY be called once after calling next or previous
         * The remove method CANNOT be called after calling add
         */
        iterator.next(); // DHJNR|T
        iterator.remove(); // DHJN|T

        System.out.println(staff);
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");

        /* The set method updates the element returned by the last call to 
         * next or previous 
         */
        iterator.previous(); // DHJ|NT
        iterator.set("Albert"); //DHJ|AT

        /* The ansNext method returns true if the list has another element.
         * It is often used in the condition of the while loop.
         */
        iterator = staff.listIterator(); // DHJAT
        while (iterator.hasNext()) {
            String n = iterator.next();
            if(n.equals("Juliet")) {
                                                //DHJ|AT
                iterator.remove();              //DH|AT
            }
        }                                        //DHAT|

        // enhanced for loops work with linked list
        for (String n: staff) {
            System.out.print(n + " ");
        }
        System.out.println("Expected: Diana Harry Albert Tom");

        /* ConcurrentModificationException
         * 
         * Can't modify a linked list while also using an iterator 
         * unless you use the iterator to do
         */
        
        iterator = staff.listIterator();
        while(iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Harry")) {
                staff.remove("Diana");
            }
        }

        /* An enhanced for loop AUTOMATICALLY creates an iterator! */
        for (String n: staff) {
            if(n.equals("Harry")) {
                staff.add("Charlie");
            }
        }
    
    }
}
