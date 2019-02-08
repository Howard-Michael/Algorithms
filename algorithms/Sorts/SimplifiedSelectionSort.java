package algorithms.Sorts;

/**
 * A simple selection sort.
 *
 * @author Michael
 */
public class SimplifiedSelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1, 6, 4, 10, 9, 7};
        System.out.println("Start SimplifiedSelectionSort");
        printArray(arr);
        printArray(sort(arr));
        System.out.println("End SimplifiedSelectionSort");
    }
    
    public static int[] sort(int[] arr){
        int temp;
        for(int i = 0; i< arr.length - 1; i++)
            for(int j = i+1; j< arr.length; j++)
                if(arr[j]<arr[i]){
                    //swap
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
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
