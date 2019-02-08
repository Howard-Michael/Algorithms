package String;

/**
 * Reverse a string using stringbuilder.
 *
 * @author Michael
 */
public class ReverseStringWithStringBuilder {
    public static void main(String args[]){
        System.out.println(reverse("Hello"));
    }
    
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        for(int i = 0; i < length / 2; i++){
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(length - i - 1));
            sb.setCharAt(length - i - 1, ch);
        }
        return sb.toString();
    }
}
