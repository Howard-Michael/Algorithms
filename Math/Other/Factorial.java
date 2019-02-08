package Math.Other;

/**
 * 
 * Calculates the factorial of an inputed number.
 *
 * @author Michael
 */
public class Factorial {
    public static void main(String args[]){
        System.out.println(factorialRecursion(10));
        System.out.println(factorialLoop(10));
    }
    
    public static int factorialRecursion(int num){
        if(num == 0)
            return 1;
        return num * factorialRecursion(num - 1);
    }
    
    public static int factorialLoop(int num){
        int ans = 1;
        while(num != 0){
            ans = ans * num;
            num--;
        }
        return ans;
    }
}
