package algorithms.Conversions;

/**
 * Converts a binary number to a decimal.
 *
 * @author Michael
 */
public class BinaryToDecimal {
    public static void main(String args[]){
        System.out.println(binaryToDec(11111111));
    }
    
    public static int binaryToDec(int binary){
        int decimal = 0;
        int power = 0;
        boolean flag = true;
        while(flag){
            if(binary ==0)
                flag = false;
            else{
                int temp = binary % 10;
                decimal = decimal + temp * powerLoop(2,power);
                binary = binary / 10;
                power++;
            }
        }
        return decimal;
    }
        
    public static int powerLoop(int x, int num){ //x^num
        int ans = 1;
        for(int i = 1; i <= num; i++)
            ans = ans * x;
        return ans;
    }
}
