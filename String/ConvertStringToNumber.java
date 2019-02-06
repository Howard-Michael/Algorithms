package String;

/**
 *
 * Converts a short string into the ASCii values offsets them and then added them into one number.
 * 
 * @author Michael
 */
public class ConvertStringToNumber {
    
    public static void main(String[] args) {
        System.out.println(convert("HelloWorld"));
    }
    
    public static long convert(String str){
        char ch[] = str.toCharArray();
        long sum = 0;
        int zeroASCii = (int) '0';
        for(char c: ch){
            int tempASCii = (int) c;
            sum = (sum * 100) + (tempASCii - zeroASCii);
        }
        return sum;
    }
}
