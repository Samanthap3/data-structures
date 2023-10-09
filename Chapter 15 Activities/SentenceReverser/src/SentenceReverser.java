import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	String reversedSentence = "";
        // Complete this method. Use a Stack.
        Stack<String> reversed = new Stack<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            reversed.push(word);
            if(word.contains(".")){
                for(String w: reversed){
                    reversedSentence += w;
                    reversed.pop();
                }
            }

        }







    }
}
