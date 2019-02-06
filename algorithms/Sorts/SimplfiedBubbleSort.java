package algorithms.Sorts;

/**
 * Compares two adjacent items in the array and swaps them if they are in the wrong order
 * 
 * Worst case performance O(n^2)
 * Best case performance O(n^2)
 * Average case performance O(n^2)
 * 
 * @author Michael
 */
public class SimplfiedBubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1, 6, 4, 10, 9, 7};
        System.out.println("Start SimplfiedBubbleSort");
        printArray(arr);
        printArray(sort(arr));
        System.out.println("End SimplfiedBubbleSort");
    }
    
    public static int[] sort(int[] sarr){
        int temp;
        int length = sarr.length;
        for(int i = 0; i < length -1; i++)
            for(int j = 0; j < length - 1 - i; j++)
                if(sarr[j] > sarr[j+1]){
                    temp = sarr[j];
                    sarr[j]= sarr[j+1];
                    sarr[j+1] = temp;
                }
        return sarr;
    }
    
    public static void printArray(int[] sarr){
        int i = 0;
        System.out.print("Array: " + sarr[i]);
        for(i = 1; i < sarr.length; i++)
            System.out.print(", " + sarr[i]);
        System.out.println();
    }
    
}
