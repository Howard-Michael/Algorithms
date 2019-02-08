package Math.Other;

/**
 * Reverses the decimal number entered.
 *
 * @author Michael
 */
public class ReverseDecimalNumber {
    public static void main(String args[]){
        int number = 123456789;
        System.out.println(reverseNum(number));
    }
    
    public static int reverseNum(int num){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        } while(num > 0);
        return reverse;
    }
}
