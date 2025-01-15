public class PrefixSum {
    public static void prefixSum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        prefixSum(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }

    }
}
