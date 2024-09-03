public class ArrayRecursion {

    static void Array(int []arr, int idx){
        //base case

        if(idx==arr.length) return;

        //self work

        System.out.println(arr[idx]);

        //recursive work

        Array(arr,idx+1);
    }

    //find max value in array
    static int MaxElementArray(int [] arr,int idx){
        //base case
        if(idx==arr.length-1) return arr[idx] ;

        //recursive problem;
        int ans = MaxElementArray(arr,idx+1);

        //self work

        return Math.max(arr[idx],ans);


    }

    //find min number in array
    static  int minInArray(int []  arr,int idx){
        // base case
        if(idx==arr.length-1) return arr[idx];

        //recursive work

        int ans = minInArray(arr,idx+1);

        //self work

        return Math.min(arr[idx],ans);

    }

    static int  sumArray(int [] arr, int idx){

        //base case
        if(idx==arr.length-1) return arr[idx];

        //recursive work;
        int ans = sumArray(arr,idx+1);

        // self work

        return arr[idx]+ans;
    }

    // linear search
    static  boolean linearSearch(int [] arr,int n, int target, int idx){
        // base case
        if(idx>=n) return false;

        // self work
        if(arr[idx]==target) return true;

        return linearSearch(arr,n,target,idx+1);

    }

    static int findIndex(int [] arr, int n, int target, int idx){
        if(idx>=n) return -1;

        if(arr[idx]==target) return idx;

        return (findIndex(arr,n,target,idx+1));

    }

    //return indices to present element in array

    static void indexInArray(int arr[] ,int n, int target, int idx){
        if(idx>=n) return;

        if(arr[idx]==target){
            System.out.println(idx);
        }
        indexInArray(arr, n,target,idx+1);
    }

    //find last index target;
    static int lastIndex(int arr[] ,int n, int target, int idx){
        if(idx>=n) return -1;

        int ans = lastIndex(arr,n,target,idx+1);

        if(arr[idx]==target && idx>ans){
            return idx;
        }
        else{
            return ans;
        }
    }

    // is array is sorted
    static  boolean isSorted(int arr[], int n, int idx){

        //base case

        if(idx==n-1){
            return true;
        }

        //recursive work

        if(arr[idx]<arr[idx+1]) {
            return isSorted(arr, n, idx + 1);
        }
        else{
            return false;
        }

    }





    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5,6,9,0};
        int target = 3;
        Array(arr,0);

//        System.out.println("max number find ");
//        System.out.println(MaxElementArray(arr,0));
//
//        System.out.println("print min number in array");
//        System.out.println(minInArray(arr,0));
//
//
//        System.out.println("sum of array");
//        System.out.println(sumArray(arr,0));


        System.out.println("linear search");

        if(linearSearch(arr, arr.length,target,0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("find index");
        int n = arr.length;

        System.out.println(findIndex(arr,n,target,0));

        System.out.println("indices print ");
        indexInArray(arr,arr.length,target,0);

        System.out.println("last index");
        System.out.println(lastIndex(arr,n,target,0));

        System.out.println("Array sorted is true and false");
        System.out.println(isSorted(arr,n,0));

    }

}
