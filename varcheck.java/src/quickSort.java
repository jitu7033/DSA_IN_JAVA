public class quickSort {
    static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    static void swap(int []arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int arr[],int st, int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i=st+1; i<=end; i++){
            if(arr[i]<=pivot) cnt++;
        }
        int pvtIndex = st+cnt;
        swap(arr,st,pvtIndex);

        int i = st;
        int j = end;
        while(i<pvtIndex && j>pvtIndex){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<pvtIndex && j>pvtIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pvtIndex;
    }

    static void quickSorts(int arr[],int st, int end){
        if(st>=end) return;
        int pi = partition(arr,st,end);
        quickSorts(arr,st,pi-1);
        quickSorts(arr,pi+1,end);

    }
    public static void main(String[] args) {
        int arr [] = {9,4,5,4,4,2,3,4,5,3};
        quickSorts(arr,0,arr.length-1);
       printArray(arr);

    }
}
