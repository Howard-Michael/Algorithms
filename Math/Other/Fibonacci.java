package Math.Other;

/**
 * Calculates the fibonacci number of an inputed number using a loop and recursion.
 *
 * @author Michael
 */
public class Fibonacci {
    public static void main(String args[]){
        System.out.println(fibLoop(10));
        System.out.println(fibRecursion(10));
    }
    
    public static int fibLoop(int num){
        int fibN1 = 1;
        int fibN2 = 1;
        int ans = 1;
        if(num > 2)
            for(int i = 3; i <= num; i++){
                ans = fibN1 + fibN2;
                fibN1 = fibN2;
                fibN2 = ans;
            }
        return ans;
    }
    
    public static int fibRecursion(int num){
        int fibN1;
        int fibN2;
        int ans;
        if(num > 1){
            fibN1 = fibRecursion(num - 1);
            fibN2 = fibRecursion(num - 2);
            ans = fibN1 + fibN2;
        } else
            ans = num;
        return ans;
    }
}
