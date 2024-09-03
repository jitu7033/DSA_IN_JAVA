import java.util.Scanner;

public class frequency {

    static int max(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];

            }
        }
        return max;
    }
    static  void freq(int arr[]){
        int freq[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
    }

    static void pref(int arr[]){
        for(int i=1; i<arr.length; i++){
            arr[i]+= arr[i]+arr[i-1];
        }
    }
    static void suffix(int arr[]){
        int n = arr.length;
        for(int i=n-2; i>=0; i--){
            arr[i]= arr[i+1]+arr[i];
        }
    }

    static void pivot(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i]+= arr[i]+arr[i-1];
        }
        int n = arr.length;
        int suffix[] = new int[arr.length];
        suffix[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i]= arr[i+1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            if(prefix[i]==suffix[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    static void maxSum(long arr[]){
        long sum = 0;
        for(long i=0; i<arr.length; i++){
            sum+=arr[(int) i];
        }
        System.out.println(Math.abs(sum));


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++) {
            long n = sc.nextInt();
            long arr[] = new long[(int) n];
            for(long j=0; j<n; j++){
                arr[(int) j] = sc.nextInt();
            }

//        freq(arr);
//        for(int i:arr){
//            System.out.println(arr[i]);
//        }
//        suffix(arr);
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        pivot(arr);
            maxSum(arr);
        }
    }
}
