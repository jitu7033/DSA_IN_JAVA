import java.util.Scanner;

public class prefix {

    static int[] reverseArrays(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        for(int i=n-1; i>=0; i--){
            ans[j++]=arr[i];


        }
        return ans;

    }

    static int totalSum(int [] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    static void printArray(int[]arr){
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }

    static boolean equalSumPartition(int [] arr){
        int totalsum = totalSum(arr);
        int pref = 0;
        for(int i=0; i<arr.length; i++){
            pref += arr[i];
            int suffixSum = totalsum-pref;
            if(suffixSum==pref){
                return true;
        }

        }
        return false;
    }
    static int [] prefixSum(int arr[]){
        int n = arr.length;
        int [] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];

        }
        return prefix;
    }


    static int[] makePrefixSum(int [] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static int[]suffixSumArray(int [] arr){
        int n = arr.length;
        for(int i=n-2; i>=0; i--){
            arr[i] = arr[i+1]+arr[i];
        }
        return arr;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array size");
        int size = sc.nextInt();
        System.out.println("enter your array");
        int []arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        int [] prefix = prefixSum(arr);
//        printArray(prefix);
//
//        System.out.println("enter q value");
//        int q = sc.nextInt();
//        while(q-- >0){
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = prefix[r] - prefix[l-1];

//            System.out.println("sum "+ ans);
//        }

//        System.out.println("equalSumPartition "+equalSumPartition(arr));

        int [] suffix = suffixSumArray(arr);
        printArray(suffix);


    }
}
