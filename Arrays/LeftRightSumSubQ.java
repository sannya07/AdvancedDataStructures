import java.util.Scanner;

public class leftRightQuerySum {
    public static int[] makePreffixSumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=input.nextInt();
        int[] arr=new int[n+1];

        // 1 based indexing instead of zero based
        for(int i=1;i<=n;i++){
            arr[i]=input.nextInt();
        }

        // by default arr[0]=0
        makePreffixSumArray(arr);

        System.out.println("Enter the number of queries");
        int q=input.nextInt();
        while(q-- >0){
            System.out.println("enter range");
            int l=input.nextInt();
            int r=input.nextInt();

            System.out.println(arr[r]-arr[l-1]);
        }

    }
}
