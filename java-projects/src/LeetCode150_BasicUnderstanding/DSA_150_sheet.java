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

// 7. all the (buy,sell) interval
// https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1

Code :
class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            sublist = new ArrayList<>();
            if(arr[i]<arr[i+1]){
                sublist.add(i);
                sublist.add(i+1);
                list.add(sublist);
            }
        }
        return list;
        
    }
}

// 7. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock
Code :
class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int mini = prices[0];
       for(int i=1;i<prices.length;i++){
           int currentPrice = prices[i]-mini;
           maxProfit = Math.max(maxProfit,currentPrice);
           mini = Math.min(mini,prices[i]);
       }
       return maxProfit;
    }

}












//25.Valid Palindrom Question
// https://leetcode.com/problems/valid-palindrome
Code:
// Time complexity: O(n)
// Space complexity: O(n)
class Solution {
    public boolean isPalindrome(String s) {
       String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
       int i =0,j=str.length()-1;
       while(i<j){
           if(str.charAt(i)!=str.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }
}

//26.isSubsequence
// https://leetcode.com/problems/is-subsequence
Code :
// TC:O(N);
// SC:o(1);
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;
        while(i>=0 && j>=0){
            if(s.charAt(i)==t.charAt(j)){
                i--;
                j--;
            }
            else{
                j--;
            }
        }
        return i==-1?true:false;
    }
}

//27. Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
// Time complexity: O(n)
// Space complexity: O(1)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int n = numbers.length;
         int i = 0;
         int j = numbers.length-1;
         int[] arr = new int[2];
         while(i<=j){
             if(numbers[i]+numbers[j]==target){
                arr[0] = i + 1;  
                arr[1] = j + 1;
                 return arr;
             }else if(numbers[i]+numbers[j]>target){
                 j--;
             }else{
                 i++;
             }
         }
         return arr;
    }
}

//28. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/
// Time complexity: O(n)
// Space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxArea = 0;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            int w = j-i;
            int area =h*w;
            maxArea = Math.max(area,maxArea);
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
       return maxArea;

    }
}

//29. 3Sum
// https://leetcode.com/problems/3sum/
// Time complexity: O(n^2)
// Space complexity: O(n)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);//sort because we have change pointers position
        if(nums.length<3)return new ArrayList<>(set);
        for(int k=nums.length-1;k>=2;k--){
            int i = 0;
            int j = k-1;
            while(i<j){
                int  currSum = nums[i]+nums[j]+nums[k];
                if(currSum<0){
                    i++;
                }else if(currSum>0){
                    j--;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    i++;
                    j--;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;

    }
}