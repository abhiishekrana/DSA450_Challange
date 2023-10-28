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

//30.  Minimum Size Subarray Sum
// https://leetcode.com/problems/minimum-size-subarray-sum
// TC : O(N)
// SC : O(N)
class Solution {
    
    public int minSubArrayLen(int target, int[] nums) {
       int left = 0;
       int right = 0;
       int minLen = Integer.MAX_VALUE;
       int sum = 0;
       while(right<nums.length){
           sum+=nums[right];
           while(sum>=target){
               minLen = Math.min(minLen,right-left+1);
               sum = sum-nums[left];
               left++;
           }
           right++;
       }
       return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

//31
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// TC:O(N)
// SC:O(N)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
       int right = 0;
       int maxLen = 0;
       Set<Character> characterSet = new HashSet<>();
       while(right<s.length()){
           char c=s.charAt(right);
           if(!characterSet.contains(c)){
               characterSet.add(c);
               maxLen = Math.max(maxLen,right-left+1);
               right++;
           }else{
               characterSet.remove(s.charAt(left));
               left++;
           }
       }
       System.out.print(characterSet);
       return maxLen;
    }
}

//Hard cover later
// 32
// 33

//34 https://leetcode.com/problems/valid-sudoku
// Time complexity: O(1) (constant time), Space complexity: O(1) (constant space).
class Solution {
    public boolean notInRow(char[][] arr,int row,int col){
        HashSet<Character> rowSet = new HashSet<>();
        for(int i=0;i<row;i++){
            if(rowSet.contains(arr[row][i]))return false;
            if(arr[row][i]!='.'){
                rowSet.add(arr[row][i]);
            }
            
        }
        return true;
    }

    public boolean notInCol(char[][] arr,int row,int col){
        HashSet<Character> colSet = new HashSet<>();
        for(int i=0;i<col;i++){
            if(colSet.contains(arr[i][col]))return false;
            if(arr[i][col]!='.'){
                colSet.add(arr[i][col]);
            }
            
        }
        return true;
    }

    public boolean notInBox(char[][] arr,int startrow,int startcol){
        HashSet<Character> boxSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char curr = arr[i + startrow][j + startcol];
                if (boxSet.contains(curr)) {
                    return false;
                }
                if (curr != '.') {
                    boxSet.add(curr);
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] arr, int row,int col){
        return notInRow(arr,row,col) && notInCol(arr,row,col)&&notInBox(arr,row-row%3,col-col%3);
    }

    public boolean isValidConfig(char[][] arr,int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(!isValid(arr,i,j))return false;
            }
            
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        boolean ans = isValidConfig(board,rows,cols);
        return ans;
    }
}

// 35
// https://leetcode.com/problems/spiral-matrix/
// TC=O(N)
// SC:O(N)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        while(left<=right && top<=bottom){
        //left to right
        for(int i = left;i<=right;i++){
            list.add(matrix[top][i]);
        }
        top++;
        // top to bottom
        for (int i = top; i <= bottom; i++) {
            list.add(matrix[i][right]);
        }
        right--;
        //right to left
         if (top <= bottom) {
        for(int i=right;i>=left;i--){
            list.add(matrix[bottom][i]);
        }
        bottom--;
         }
        //bottom to top
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }
        left++;
        }
        }
        return list;

    }
    
}

// 36
// https://leetcode.com/problems/rotate-image
TC:o(n*n);
SC:o(1);
class Solution {
    //Transpose of matrix
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse each row
        for(int i=0;i<rows;i++){
            int left = 0;
            int right = cols-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;

            }
        }

    }
}

//37
// https://leetcode.com/problems/set-matrix-zeroes/
// TC:O(M*N)
// SC:o(1)
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] rowarr = new boolean[row];
        boolean[] colarr = new boolean[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                   rowarr[i]=true;
                    colarr[j]=true;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rowarr[i] || colarr[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}

// 38 Game of life

//39
// https://leetcode.com/problems/ransom-note
// TC : O(N)
// SC : O(N)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c : magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c) &&map.get(c)>0){
                map.put(c,map.getOrDefault(c,0)-1);
            }else{
                return false;
            }
            
        }
        return true;
    }
}

//40
//Isomorphic String
// https://leetcode.com/problems/isomorphic-strings/
// Logic : map both the map charcater and check if the both charcter and not qual and one map element visted earlier
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Boolean> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map1.containsKey(ch1)){
                if(map1.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                if(map2.containsKey(ch2)==true)return false;
                else{
                    map1.put(ch1,ch2);
                    map2.put(ch2,true);
                }
            }
        }
        return true;
    }
}

//41
// https://leetcode.com/problems/word-pattern
//TC:O(N)
//SC:O(N)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length()!=word.length)return false;
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Boolean> map2 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map1.containsKey(ch)==false){
                if(map2.containsKey(word[i])==true){
                    return false;
                }else{
                    map1.put(ch,word[i]);
                    map2.put(word[i],true);
                }
            }
            else{
                String value = map1.get(ch);
                    if(value.equals(word[i])==false)return false;
            }
        }
        return true;
    }
}

//42
// https://leetcode.com/problems/valid-anagram/
// TC:O(N)
// SC:O(N)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(map.containsKey(c) &&map.get(c)>0){
                map.put(c,map.getOrDefault(c,0)-1);
            }else{
                return false;
            }
            
        }
        return true;
    }
}

//43
// https://leetcode.com/problems/group-anagrams
// TC:O(N)
// SC:O(N)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagram = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] character = s.toCharArray();
            Arrays.sort(character);
            String sorted = new String(character);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        groupAnagram.addAll(map.values());
        return groupAnagram;
    }
}

//44
// https://leetcode.com/problems/two-sum/
// O(N)
// O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int compliment = target-nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

// 45
// https://leetcode.com/problems/happy-number/
//  O(log(n)) 
//   O(log(n)) 
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int rem=0;
        while(n!=1){
            int curr = n;
            int sum = 0;
            while(curr!=0){
                 rem = curr%10;
                sum+=rem*rem;
                curr=curr/10;
            }
            if(seen.contains(sum))return false;
            else{
                seen.add(sum);
                n=sum;
            }
        }
        return true;
    }
}

//46
// https://leetcode.com/problems/contains-duplicate-ii
//O(N)
//O(N)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&Math.abs(i-map.get(nums[i]))<=k){
                return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}

//47
// https://leetcode.com/problems/longest-consecutive-sequence/
// O(n)
// O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int n:nums){
           set.add(n);
       }
       int maxStreak = 0;
       for(int num:set){
           if(!set.contains(num-1)){
               int currentStreak = 1;
               int number = num;
               while(set.contains(number+1)){
                   currentStreak++;
                   number++;
               }
             maxStreak = Math.max(maxStreak,currentStreak);  
           }
       }
       return maxStreak;
    }
}

// 48
// https://leetcode.com/problems/summary-ranges/
// O(N)
// O(1)
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int left=0;
        int right=0;
        while(right<nums.length){
            if(right+1<nums.length && nums[right+1]==nums[right]+1){
                right++;
            }else{
                if (left == right) {
                    list.add(nums[left] + "");
            } else {
                list.add(nums[left] + "->" + nums[right]);
            }
            left=right+1;
            right++;
            }
            
        }
        return list;
    }
}

//49. Interval here i have to work little
//50. Interval here i have to work little

//51
// https://leetcode.com/problems/valid-parentheses/
// O(N)
// O(N)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stk.push(c);
            }
            else{
                if(stk.isEmpty())return false;
                if(c==')' && stk.peek()=='(')stk.pop();
                else if(c==']' && stk.peek()=='[')stk.pop();
                else if(c=='}' && stk.peek()=='{')stk.pop();
                else return false;
            }
        }
        return stk.isEmpty();
    }
}

//52
// https://leetcode.com/problems/simplify-path/
//O(N)
//O(N)
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk =new Stack();
        String res = "";
        for(int i=0;i<path.length();i++){
            char ch = path.charAt(i);
            if(ch=='/')continue;
            String temp = "";
            while(i<path.length() && path.charAt(i)!='/'){
                temp+=path.charAt(i)+"";
                i++;
            }
            
            if(temp.equals("."))continue;
            else if(temp.equals("..")){
                if(!stk.isEmpty()){
                    stk.pop();
                }
                continue;
            }
            else{
            
                stk.push(temp);
            }
        }
        while(!stk.isEmpty()){
            res = "/"+stk.peek()+res;
            stk.pop();
        }
        if(res.length()==0)return "/";
        return res;
        
    }
}

//53
// https://leetcode.com/problems/min-stack/
// O(N)
// O(N)
class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        list.remove(list.size()-1);
    }
    
    public int top() {
      int top =  list.get(list.size()-1);
      return top;
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(min>list.get(i)){
                min = list.get(i);
            }
        }
        return min;
        
    }
}

//54
//https://leetcode.com/problems/evaluate-reverse-polish-notation/
// O(N)
// O(N)
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack();
        for(String tok:tokens){
            if(tok.equals("+")){
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n1+n2;
                stk.push(res);
            }
            else if(tok.equals("-")){
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n2-n1;
                stk.push(res);
            }
            else if(tok.equals("*")){
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n1*n2;
                stk.push(res);
            }
            else if(tok.equals("/")){
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n2/n1;
                stk.push(res);
            }else{
                stk.push(Integer.parseInt(tok));
            }
        }
        return stk.pop();
    }
}

//55 Hard

//56
//  https://leetcode.com/problems/linked-list-cycle/
//  O(N)
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow==fast)return true;
       } 
       return false;
    }
}
//57
//  https://leetcode.com/problems/add-two-numbers/submissions
// O(N)
// O(N)
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;
         while(l1!=null ||l2!=null||carry == 1){
            int sum = 0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry =sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp=temp.next;
        }
        return dummy.next;
    }
}

//58
//  https://leetcode.com/problems/merge-two-sorted-lists/
// O(N)
// O(N)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(ptr1!=null && ptr2!=null){
            if(ptr1.val<=ptr2.val){
                temp.next = ptr1;
                ptr1=ptr1.next;
            }else{
                temp.next = ptr2;
                ptr2=ptr2.next;
            }
            temp =temp.next;

        }
        if(ptr1==null){
            temp.next = ptr2;
        }
        if(ptr2==null){
            temp.next = ptr1;
        }

        return dummy.next;
    }
}

//59 Reverse linked list do later Important question

//60 Hard;

// 61
//  https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//  O(N)
//  O(N)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;

        for(int i=1;i<=n;i++){
            fast = fast.next;
        }

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}

//62
//  https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
// O(N)
// O(1)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        dummy.next = head;
        while(head!=null){
            if(head.next!=null && head.val == head.next.val){
                while(head.next!=null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}

//  63
//  https://leetcode.com/problems/rotate-list/
//  O(N)
//  O(1)
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode last = head;
        int count = 1;
        while(last.next!=null){
            count++;
            last = last.next;
        }
        k = k % count; 
        if (k == 0) {
            return head; // No rotation needed
        }

        last.next = head;
        int rotate_value = count - k;
        ListNode end = head;
        ListNode newHead = head;
        for(int i=0;i<rotate_value-1;i++){
            end = end.next;
        }
        newHead = end.next;
        end.next = null;
        return newHead;
    }
}

//64
// https://leetcode.com/problems/partition-list/
// O(n)
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();
        ListNode higher = new ListNode();
        ListNode smallHead = small;
        ListNode higherHead = higher;

        while(head!=null){
            if(head.val<x){
                smallHead.next = head;
                smallHead = smallHead.next;
            }else{
                higherHead.next = head;
                higherHead = higherHead.next;
            }
            head = head.next;
        }
        higherHead.next = null;
        smallHead.next = higher.next;
        
        return small.next;
    }
}

//65 WILL DO LATER, LRU CACHE

//66
//  https://leetcode.com/problems/same-tree/
// O(N)
// O(N)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        if(p.val!=q.val)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

//67
//  https://leetcode.com/problems/invert-binary-tree/
//O(N)
//O(login)
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

//68
//O(H)
//  O(N)
 //Symmtric Tree
//  https://leetcode.com/problems/symmetric-tree/

class Solution {
    public boolean isSymmetric(TreeNode root) {
       //we can using mirror image concept
       return isMirror(root,root);
    }

    private boolean isMirror(TreeNode left,TreeNode right){
        if(left==null && right==null)return true;
        if(left==null || right==null)return false;
        return (left.val==right.val) && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}

//68.Construct a Binary Tree from PreOrder and InOrder
//69.Construct a Binary Tree from InOrder and PostOrder

//70
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii
// O(N)
// O(N)
class Solution {
    public Node connect(Node root) {
       if(root==null)return root;
       Queue<Node> queue = new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
           Node pre = null;
           int size = queue.size();
           while(size-->0){
           Node curr = queue.poll();
           if(curr.left!=null){
               queue.offer(curr.left);
           }
           if(curr.right!=null){
               queue.offer(curr.right);
           }
           if(pre!=null){
               pre.next =curr;
           }
           pre =curr;
       }
       }
       return root;
    }
}
