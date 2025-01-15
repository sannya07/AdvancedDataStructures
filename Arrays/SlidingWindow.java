public class SlidingWindow {
    public static int maxSubArraySum(int[] nums,int windowSize){
        int maxSum=Integer.MIN_VALUE;
        int windowSum=0;
        for(int i=0;i<windowSize;i++){
            windowSum+=nums[i];
        }
        maxSum=windowSum;
        for(int i=windowSize;i<nums.length;i++){
            windowSum+=nums[i]-nums[i-windowSize];
            maxSum=Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums={2,1,5,1,3,2};
        int windowSize=3;
        System.out.println(maxSubArraySum(nums, windowSize));
    }
}
