// 1.Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array
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

//2. Remove Element
https://leetcode.com/problems/remove-element

Code :
class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            nums[j++]=nums[i];
            cnt++;
        }
        return cnt;
    }
}

// 3.Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array

Code :
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int j=0;
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]!=nums[i+1]){
               nums[j++]=nums[i];
           }
       }
       nums[j++] = nums[nums.length-1];//this element is always unique.
       return j;

    }
}

// 4.Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii

Code : 
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2)return n;
        int count = 1;
        int j = 1; // index start 1 as it is always included
        for(int i = 1;i<n;i++){//start from 1 is if have match atmost 2;
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}

// 5. Majority Element
// https://leetcode.com/problems/majority-element
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int threshold = (nums.length/2);
        for(int k : map.keySet()){
            if(map.get(k)>threshold){
                return k;
            }
        }
        return -1;
    }
}

// 6.Rotate Array
// https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

Code :
class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int k, int n)
    {
        int[] temp = new int[k];
        if(k>=n){   //This steps tells us if value of K>n
            k=k%n;
        }
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        
        // Shift the remaining elements to the left by k positions
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        
        // Copy the elements from the temp array back to the original array
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }
}