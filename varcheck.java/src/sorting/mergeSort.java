package src.sorting;

public class mergeSort {


    static void printArray(int []arr){
        for(int i: arr){
            System.out.println(i+" ");
        }
        return;
    }
    static void merge(int []arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int left [] = new int[n1];
        int right[] = new int[n2];
        int i,j,k;
        for(i=0; i<n1; i++) left[i] = arr[l+i];
        for(j=0; j<n2; j++) right[j] = arr[mid+1+j];

        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++] = left[i++];

            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }

    }
    static void mergeSorted(int [] arr, int l, int r){
        int mid = (l+r)/2;
        // base case
        if(l>=r) return;
        // recursive case;
        mergeSorted(arr,l,mid);

        mergeSorted(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4,8,9};

        mergeSorted(arr,0,arr.length-1);
        printArray(arr);

    }
}
