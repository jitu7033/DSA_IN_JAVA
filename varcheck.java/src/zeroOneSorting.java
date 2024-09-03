public class zeroOneSorting {

    static void Sort(int arr[]){
        int n = arr.length;
        int l= 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
               int temp = arr[mid];
               arr[mid] = arr[l];
               arr[l] = temp;
                mid++;
                l++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,2,1,0,0,1};
        Sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
