import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        // Your work goes here
        Set <Integer> prime = new HashSet<>();
        
        for(int start = 1; start<=n; start++)
        {
            prime.add(start);
        }

        Iterator<Integer> iterator = prime.iterator();
        
        while(iterator.hasNext())//checks all numbers in set
        {
            int number = iterator.next();//takes number
            for ( int count = 2; count<number; count++)//checks if number is divisible by all numbers up to the number we're checking
            {
                if(number % count == 0)// if divisible removes it
                {
                    iterator.remove();
                    break;
                }
                
                
            }
            
        }
        System.out.println(prime);


    }
}
