public class MaximumProductSubArray {
    public static int maximumProduct(int[] arr,int k){
        int maxProd=Integer.MIN_VALUE;
        int windowProduct=1;
        for(int i=0;i<k;i++){
            windowProduct*=arr[i];
        }
        maxProd=windowProduct;
        for(int i=k;i<arr.length;i++){
            //since division by zero is considered undefined
            if(arr[i-k]!=0) windowProduct=(windowProduct/arr[i-k])*arr[i];
            // incase zero is present?
            else{
                windowProduct=1;
                for(int j=i-k+1;j<=i;j++){
                    windowProduct*=arr[j];
                }
            }
            maxProd=Math.max(maxProd,windowProduct);
        }
        return maxProd;
    }
    public static void main(String[] args) {
        
    }
}
