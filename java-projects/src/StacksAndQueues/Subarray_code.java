int[] arr = {1, 2, 3, 4};
int n = arr.length;

for (int start = 0; start < n; start++) {
    for (int end = start; end < n; end++) {
        // Process subarray arr[start...end]
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*****
 Ase hi
 */