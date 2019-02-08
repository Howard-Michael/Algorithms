package Math.Other;

/**
 *
 * An Armstrong number is a number that the sum of its digits raised to the third power is equal to the number itself.
 * 
 * @author Michael
 */
public class Armstrong {
    public static void main(String args[]){
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(532));
    }
    
    public static boolean isArmstrong(int num){
        int r = 0;
        int orginal = num;
        while(num != 0){
            int remainder = num % 10;
            r = r + remainder * remainder * remainder;
            num = num / 10;
        }
        if(orginal == r)
            return true;
        return false;
    }
}
