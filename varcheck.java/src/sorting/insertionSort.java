package src.sorting;

public class insertionSort {

    static void insertionSorting(int[] arr){
        for(int i=1; i<arr.length; i++){
           int j=i;
           while(arr[j]<arr[j-1]){
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
               j--;
           }

        }
    }

    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return;
    }
    public static void main(String[] args) {
        int [] arr = {2,7,9,8,4,6,3};
//        insertionSorting(arr);
        insertionSort(arr);
        //print arr
        for(int i: arr){
            System.out.println(i+" ");
        }

    }
}
