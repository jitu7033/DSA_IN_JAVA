public class binarySearch {

    static int sqrt(int n){
        int start = 0;
        int end = n;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if((mid*mid)==n){
                return mid;
            }
            else if((mid*mid)<n){
                ans = mid;
                start = mid+1;
            }
            else{
               end= mid-1;
            }
        }
        return ans;
    }

    static int first(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while(start<=end){
            int mid  = start+(end-start)/2;
            if(target==arr[mid]){
                ans = mid;
               end = mid-1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                ans = -1;
            }
        }
        return ans;
    }

    static  boolean   Search(int arr[],int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans= 0;
        while(start<=end) {
            int mid = (start+end)/2;
            if (target==arr[mid]) {
                return true;
            } else if (target<arr[mid]) {
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }
            else{
              start = mid+1;
            }
        }
       return false;

    }


    // if duplicate element are present in array the this logic is
    static int unsorted(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) return mid;

            else if(arr[mid]<arr[end])
                if(arr[mid]<target && target<=arr[end])
                    start = mid+1;
                else
                    end = mid-1;
            else
                if(target>=arr[start] && target<arr[mid])
                    end = mid-1;
                else
                    start = mid+1;

        }
        return ans;


    }

    // if duplicate element are present in array then i will use this logic:

    static int duplicateSearch(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start+(end-start) / 2;
            if (arr[mid] == target){
                return mid;
            }

            else if (arr[mid] == arr[end] && arr[start] == arr[mid]) {
                start++;
                end--;
            } else if (arr[mid] <= arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }



    public static void main(String[] args) {
//        int arr [] = {1,1,1,1,1,1,1,2,1,1,1};
//        int target = 2;

        int n  = 2147395599;
//        System.out.println(Search(arr,target));
////        Search(arr,target);
//        System.out.println(first(arr,target));
//        int i=0;
//        while(i<=n){
//            System.out.printf(" %d square root of \n %d ",i,sqrt(i));
//            i++;
//        }

//        System.out.println(unsorted(arr,target));
//        System.out.println(duplicateSearch(arr,target));
//        System.out.println(sqrt(n));
        System.out.println(sqrt(n));

    }
}
