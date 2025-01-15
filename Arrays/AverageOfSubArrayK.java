public class AverageOfSubArray {
    public static double[] subArrayAverage(int[] arr,int k){
        double[] result=new double[arr.length-k+1];
        double windowSum=0;

        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        result[0]=windowSum/k;
        for(int i=k;i<arr.length;i++){
            windowSum+=arr[i]-arr[i-k];
            result[i-k+1]=windowSum/k;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        double[] averages = subArrayAverage(arr, K);
        
        System.out.print("Averages of Subarrays: ");
        for (double avg : averages) {
            System.out.print(avg + " ");
        }
    }
}
