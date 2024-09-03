public class countshort {

    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int  max(int arr[]){

        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int arr[]){

        int n = arr.length;
        int max = max(arr);
        int count[] = new int[max+1];
        for(int i=0; i<n ;i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++] = i;
            }
        }
    }
    static void count(int arr[]){
        int n = arr.length;
        int max = max(arr);
        int count[] = new int[max+1];
        int output[] = new int[n];
        for(int i=0; i<n ;i++) {
            count[arr[i]]++;
        }
        for(int i=1; i<count.length; i++){
            count[i] = count[i-1]+count[i];
        }
        for(int i=n-1; i>=0; i--){
            int index = count[arr[i]]-1;
            output[index] = arr[i];
            count[arr[i]]--;
        }
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,7,3,4,2,1};
        count(arr);
//        countSort(arr);
        printArray(arr);


    }
}
