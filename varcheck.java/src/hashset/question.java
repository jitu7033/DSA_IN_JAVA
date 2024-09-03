package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class question {
    static void longestConsucative(int arr[]){
        HashSet<Integer>st = new HashSet<>();
        int sum = 0;
        int max = 1;
        for(int i:st) {
            if (!st.contains(i - 1)) {
                int currNum = i;
                int currStrike = 1;
                while (st.contains(currNum + 1)) {
                    currStrike++;
                    currNum++;

                }
                max = Math.max(max, currStrike);
            }
        }
        System.out.println(max);
    }

    static void solution(int arr[]){
        HashSet<Integer>st = new HashSet<>();
        int max = 0;
        for(int x:arr){
            if(st.contains(x)){
                st.remove(x);
            }
            else{
                st.add(x);
                max = Math.max(max,st.size());
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        int arr[] = new int[n*2];
        for (int i = 0; i < n*2; i++) {
            arr[i] = fs.nextInt();
        }
        solution(arr);
    }
}
