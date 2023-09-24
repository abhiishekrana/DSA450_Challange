import java.util.*;

public class Main {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int function(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] <= pivot && i <= high) {
                i++;
            }
            while (arr[j] >= pivot && j >= low) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    private static void QuickSort(int[] arr, int low, int high) {
        while (low < high) {
            int partition = function(arr, low, high);
            QuickSort(arr, low, partition - 1);
            // low = partition + 1;
            QuickSort(arr, partition + 1,high);
            
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = { 4, 6, 2, 5, 7, 9, 6 };
        int low = 0;
        int high = arr.length - 1;
        QuickSort(arr, low, high);
        System.out.println(Arrays.toString(arr)); // Print sorted array
    }
}
