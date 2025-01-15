public class MinElementWindow {
    public static int MinimumSubArraySum(int[] arr,int windowSize){
        int minSum=Integer.MAX_VALUE;
        int windowSum=0;

        for(int i=0;i<windowSize;i++){
            windowSum+=arr[i];
        }
        minSum=windowSum;
        for(int i=windowSize;i<arr.length;i++){
            windowSum+=arr[i]-arr[i-windowSize];
            minSum=Math.min(minSum, windowSum);
        }
        return minSum;
    }
    public static void main(String[] args) {
        int[] arr={4,2,1,7,5,3};
        int windowSize=2;
        int ans=MinimumSubArraySum(arr, windowSize);
        System.out.println(ans);
    }
}
