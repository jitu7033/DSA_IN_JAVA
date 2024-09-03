package recursion;

import java.util.ArrayList;

public class sortArray {

    static void insert(ArrayList arr, int temp){
        if(arr.size()==0 || arr.size()-1 != temp){
           arr.add(temp);
           return;
        }
        int val = (int) arr.get(arr.size() - 1);
         insert(arr,temp);
         arr.add(val);
         return;


    }

    static void arrSort(ArrayList arr){
        // base case

        if(arr.size()==0) return;

        // take last value in new variable

        int tmp = (int) arr.get(arr.size() - 1);

        arr.clear();

        insert(arr,tmp);
    }
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arrSort(arr);

    }
}
