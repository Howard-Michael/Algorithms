package algorithms.Sorts;

/**
 * Compares two adjacent items in the array and swaps them if they are in the wrong order, but has a flag to tell if there has been no swap.
 * 
 * Worst case performance O(n^2)
 * Best case performance O(n)
 * Average case performance O(n^2)
 * 
 * @author Michael
 */
public class ModifiedBubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1, 6, 4, 10, 9, 7};
        System.out.println("Start ModifiedBubbleSort");
        printArray(arr);
        printArray(sort(arr));
        System.out.println("End ModifiedBubbleSort");
    }
    
    public static int[] sort(int[] arr){
        Boolean swap = true;
        int temp;
        int length = arr.length;
        for(int i = 0; i < length - 1 && swap; i++){
            swap = false;
            for(int j = 0; j < length - i - 1; j++)
                if(arr[j] > arr[j+1]){
                    swap = true;
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
        }
        return arr;
    }
    
    public static void printArray(int[] arr){
        int i = 0;
        System.out.print("Array: " + arr[i]);
        for(i = 1; i < arr.length; i++)
            System.out.print(", " + arr[i]);
        System.out.println();
    }
}
