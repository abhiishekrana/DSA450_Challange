// 1.Merge Sorted Array

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].

Code:
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int mergeptr = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[mergeptr] = nums1[p1];
                p1--;
            }else{
                nums1[mergeptr] = nums2[p2];
                p2--;
            }
            mergeptr--;
        }
        while(p2>=0){
            nums1[mergeptr]=nums2[p2];
            mergeptr--;
            p2--;
        }
    }
}
