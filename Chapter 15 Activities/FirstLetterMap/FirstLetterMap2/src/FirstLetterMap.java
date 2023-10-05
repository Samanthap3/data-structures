import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter. Then print out the word sets in
 * alphabetical order. Update the map by modifying
 * Worked Example 15.1.
*/
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/FirstLetterMap/FirstLetterMap2/src/test2.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Character, String> firstLetter = new HashMap<>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                Character c = word.charAt(0);

                // Update the map here
                // Modify Worked Example 15.1
                if(firstLetter.get(c) != null)
                    {
                        firstLetter.put(c, firstLetter.get(c) + ", "  +word);
                    }
                    else
                    {
                        firstLetter.put(c, word);
                    }
                    /*
                     * Map<Character, String> firstLetter = new TreeMap<>();
                     * String str = word;
                     * if(str == null){
                     * str.word;}
                     * else{
                        if(str.indexOf(word) ==-1)
                        str= str + "," + word;}
                     */


            }

            // Print the map here in this form
            // a: [a, able, aardvark]
            Set<Character> keys = firstLetter.keySet();
            for(Character key: keys)
                {
                    System.out.println(key + ": ["+firstLetter.get(key) + "]");

                }  
                
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }
}
