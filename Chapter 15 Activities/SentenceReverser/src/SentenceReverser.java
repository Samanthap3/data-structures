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
        Stack<String> words = new Stack<>();
        Stack<String> reversed = new Stack<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            
            if((int)word.charAt(0) <=90)
                words.push(word.toLowerCase() + ".");

            else if(!word.contains(".")){
                words.push(word);
            }
            else{
                words.push(word.substring(0, 1).toUpperCase() + word.substring(1, word.length()-1));
                while(!words.empty()){
                    reversed.push(words.pop());
                }
            }
        }

        
        for(String reverse: reversed){
            reversedSentence += reverse + " ";
        }

        return reversedSentence;







    }
}
