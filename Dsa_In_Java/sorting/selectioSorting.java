package src.sorting;

public class selectioSorting {
    static void selectionSort(int[]arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,2,3,1};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
