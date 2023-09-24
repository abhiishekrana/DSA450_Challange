import java.util.*;

public class Main {
    private static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                al.add(arr[left]);
                left++;
            } else {
                al.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            al.add(arr[left]);
            left++;
        }
        while (right <= high) {
            al.add(arr[right]);
            right++;
        }
        for (int i = 0; i < al.size(); i++) {
            arr[low + i] = al.get(i);
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) { // Change the condition from low <= high to low < high
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);
        for (int i = 0; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
