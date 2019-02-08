package Math.Other;

/**
 * Calculates the power of an inputed number using a loop and recursion.
 *
 * @author Michael
 */
public class Power {
    public static void main(String args[]){
        System.out.println(powerLoop(5, 10));
        System.out.println(powerRecursion(5, 10));
    }
    
    public static int powerLoop(int x, int num){ //x^num
        int ans = 1;
        for(int i = 1; i <= num; i++)
            ans = ans * x;
        return ans;
    }
    
    public static int powerRecursion(int x, int num){ //x^num
        int ans;
        if(num>0)
            ans = powerRecursion(x,num-1) * x;
        else
            ans = 1;
        return ans;
    }
}
