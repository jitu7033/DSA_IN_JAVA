import java.util.Scanner;

public class cheknoispresentyano{

    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        return;
    }

    static int[] frequencyArray(int [] arr){
        int [] freq = new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("enter element in array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int [] freq = frequencyArray(arr);

        System.out.println("number of quaries");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("enter no to be searched");
            int val = sc.nextInt();
            if(freq[val]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }


    }
}
