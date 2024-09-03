import java.util.Scanner;

public class miscelenious {


    static void rotateArrayTakeAnySpace(int[] arr,int k){

    }


    static int[] reversenoarray(int [] arr ,int k){
        int n = arr.length;
        k = k%n;
        int [] ans = new int[n];
        int j = 0;
        for(int i = n-k; i<n; i++) {
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];

        }
        return ans;

    }




    static void  printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // swaping array
    static void reverseArray(int []arr){
        int i = 0,j=arr.length-1;
        int temp = arr[i];
        while(i<j) {
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            return;
        }
    }

    static int[] rotateArray(int [] arr,int k){
        int n = arr.length;
        k = k%n;
        int [] ans = new int[n];
        int j = 0;
        for(int i = n-k; i<n; i++){
            ans[j++] = arr[i];

        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;

    }
    static int[] ReverseAnArray(int arr[]){
        int n = arr.length;
        int answ[] = new int[n];
        int j = 0;
        for(int i = n-1; i>=0; i--){
            answ[j++] = arr[i];

        }
        return answ;
    }



    static int swap(int a,int b){
        int temp = a;
        System.out.println("before swaping");
        System.out.println(a);
        System.out.println(b);

        a = b;
        b = temp;

        System.out.println("after swping");
        System.out.println(a);
        System.out.println(b);
        return 1;
    }

    static int swapInSecondMethod(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("swaping second method");
        System.out.println(a);
        System.out.println(b);
        return 1;
    }
    static int[] reverseArrays(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        for(int i=n-1; i>=0; i--){
            ans[j++]=arr[i];


        }
        return ans;

    }
    public static void main(String[] args) {
//        int a = 3;
//        int b = 9;
//        swap(a,b);
//        int [] arr = {10,2,5,6,8};
//        swapInSecondMethod(a,b);

        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();

        int [] arr = {10,2,5,6,8};

        int []ans = reverseArrays(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
//        System.out.println(ans);
////
//        System.out.println("print reverse array");
//         reverseArrays(arr);
//         printArray(arr);
//
//        rotateArray(arr,k);
//        int [] ans = rotateArray(arr,k);
//        printArray(ans);

//        reversenoarray(arr,k);
//        int [] ans = reversenoarray(arr,k);
//        printArray(ans);

        System.out.println("jraj");
        ReverseAnArray(arr);
        int answ[] = ReverseAnArray(arr);
        printArray(arr);

//
//        reverseArray(arr);
//        printArray(arr);

//
    }
}
