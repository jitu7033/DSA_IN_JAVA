public class raddixshort {

    static int  max(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void countSort(int arr[] ,int place){
        int n = arr.length;
        int count[] = new int[10];
        int output[] = new int[n];
        for(int i=0; i<n; i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            int idx = count[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0; i<output.length; i++){
            arr[i] = output[i];
        }
    }
    static  void radixSort(int arr[]){
        int max = max(arr);
       for(int place=1; max/place>0; place *=10){
           countSort(arr,place);
       }

    }
    public static void main(String[] args) {
        int  arr[] = {102, 304, 231, 001, 987};
        radixSort(arr);
        printArray(arr);    

    }
}
