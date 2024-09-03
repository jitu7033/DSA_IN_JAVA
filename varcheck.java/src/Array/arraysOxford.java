import java.util.Scanner;

public class arraysOxford {
    static void PrintArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void bubbleSort(int [] arr){
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int y = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = y;
                    flag = true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    // selection sort
    static void selectionSort(int []arr){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return;
    }

    // insertion sort
    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0 &&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return;
    }

    // reverse an array
    static void reverse(int[]arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return;
    }

    // pair sum
    static int pairSum(int []arr, int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                   count++;
                }
            }
        }
        return count;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter your element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
//        PrintArray(arr);
//        src.sorting.bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
//        reverse(arr);
//        System.out.println(pairSum(arr,target));
        PrintArray(arr);

    }
}
