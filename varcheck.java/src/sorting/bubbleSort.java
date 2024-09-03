package src.sorting;

public class bubbleSort {

    static void bubbleSort(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i =0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    // swap 2 no
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int arr[] = {6,7,8,1,2,3,4};
        bubbleSort(arr);
        //print arr
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
