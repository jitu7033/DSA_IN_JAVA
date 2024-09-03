public class choclateProblem {
    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void bubbleSort(int []arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                // swap element:
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
    }

    static  int choDistribution(int[]arr,int n,int m){

        int min_dif = Integer.MAX_VALUE;

        for(int i=0; i+m-1<n; i++){
            int diff = arr[i+m-1]-arr[i];
            if(diff<min_dif){
                min_dif = diff;
            }
        }
        return min_dif;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        int n = arr.length;
        printArray(arr);

        // min diff
        System.out.println("min diff");
        System.out.println(choDistribution(arr,n,m));
        printArray(arr);


    }
}
