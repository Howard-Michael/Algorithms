package algorithms.Sorts;

/**
 * Modified selection sort.
 *
 * @author Michael
 */
public class ModifiedSelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1, 6, 4, 10, 9, 7};
        System.out.println("Start ModifiedSelectionSort");
        printArray(arr);
        printArray(sort(arr));
        System.out.println("End ModifiedSelectionSort");
    }
    
    public static int[] sort(int[] arr){
        int temp, smallest;
        for(int i = 0; i< arr.length - 1; i++){
            smallest = i;
            for(int j = i+1; j< arr.length; j++)
                if(arr[j]<arr[smallest]){
                    //swap
                    temp = arr[j];
                    arr[j] = arr[smallest];
                    arr[smallest] = temp;
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
