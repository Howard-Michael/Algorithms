package Math.Other;

/**
 * Checks if a number is prime.
 *
 * @author Michael
 */
public class Prime {
    public static void main(String args[]){
        System.out.println(isPrime(5));
        System.out.println(isPrime(25));
    }
    
    public static boolean isPrime(int num){
        int sqrt;
        sqrt = (int) Math.sqrt(num) + 1;
        for(int i = 2; i < sqrt; i++)
            if(num % i == 0)
                return false;
        return true;
    }
}
