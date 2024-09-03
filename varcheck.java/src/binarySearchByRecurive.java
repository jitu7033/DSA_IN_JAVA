public class binarySearchByRecurive {
    static boolean Search(int []arr, int start, int end,int target){
        int n = arr.length;
        int mid = start+(end-start)/2;
        if(start<=end)

            if (target == arr[mid])
                return true;


            else if (target > arr[mid])
                return Search(arr, mid + 1, end, target);


            else if (target < arr[mid])
                return Search(arr, start, mid - 1, target);



       return false;
    }
    static int min(int arr[],int start,int end){
        int mid = start+(end-start)/2;
        int ans = Integer.MAX_VALUE;
        if(start<=end) return ans;

        if(arr[mid]>end){
           return min(arr,mid+1,end);
        }
        else if(arr[mid]<=end){
            ans = mid;
            return min(arr,start,mid-1);

        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,54};
        int target = 1;

        System.out.println(Search(arr,0,arr.length-1,target));

        System.out.println(min(arr,0,arr.length-1));
    }
}
