public class minBinary {


    static int max(int arr[]){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>arr[mid-1]){
                ans = arr[mid];
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    static int search(int arr[]){
        int start  =0;
        int ans = Integer.MAX_VALUE;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>end){
                start = mid+1;
            }
            else if(arr[mid]<=end){
                end = mid-1;
                ans = arr[mid];
            }

        }
        return ans;
    }


    static int duplicateSearch(int arr[]){
        int ans = 0;
        int start = 0;
        int end = arr.length-1;
        int mid = start+1;

        while(start<=end){
            while(mid<end){
                if(arr[start]==arr[mid]){
                    arr[ans] = arr[start];
                    start++;
                    mid++;
                }
                else{
                    mid++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,11,12,42,41,32,23,14,6,6};
//        System.out.println(search(arr));
//        System.out.println(duplicateSearch(arr));
        System.out.println(max(arr));

    }
}
