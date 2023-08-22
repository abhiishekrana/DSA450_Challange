/******************************************************************************

Max Ones count using sliding window
*******************************************************************************/
    public class Main {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int maxOnesCount=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                left=right+1;
            }else{
                maxOnesCount = Math.max(maxOnesCount,right-left+1);
            }
        }
        return maxOnesCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,1,1,1,1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Max Consecutive Ones: " + result);
    }
}

