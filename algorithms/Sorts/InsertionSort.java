package algorithms.Sorts;

/**
 *
 * @author Michael
 */
public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1, 6, 4, 10, 9, 7};
        System.out.println("Start InsertionSort");
        printArray(arr);
        printArray(sort(arr));
        System.out.println("End InsertionSort");
    }
    
    public static int[] sort(int[] arr){
        int temp, j;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            for(j = i; j > 0 && temp < arr[j-1]; j--)
                arr[j] = arr[j-1];
            arr[j] = temp;
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
