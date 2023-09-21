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
        int end = strings.size()-1;//position one less so it is the size after first is removed
        while(end != 0)
        {
            ListIterator<String> startIterator = strings.listIterator(); // |DHRT
            String current = startIterator.next(); //D|HRT current is D
            startIterator.remove(); //|HRT
            startIterator = strings.listIterator(end); //HRT|
            startIterator.add(current);//HRTD
            end--;
        }


        /*while(count < end)
        {
           count++;
           //System.out.print(endIterator.hasNext()==false);
           //System.out.print(end);
           String current  = startIterator.next();
           //System.out.print(current);
           //startIterator.next();
           //startIterator.remove();
           if(!endIterator.previous().equals(current))
           {
            endIterator.next();
            endIterator.add(current);
           }
        }*
        System.out.print(strings);
        int count = 0;
        int end = strings.size();
        

            ListIterator<String> endIterator = strings.listIterator(strings.size());
            
            while(!endIterator.hasNext() && count<end)
            {
                count++;
                String current = endIterator.previous();
                endIterator.remove();
                ListIterator<String> startIterator = strings.listIterator();
                startIterator.next();//concurrent mod error
                //startIterator.add(current);
                //System.out.print(count);
                
            }*/
        
    }
}