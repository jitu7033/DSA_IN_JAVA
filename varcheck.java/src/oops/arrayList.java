package oops;

import java.util.*;
//import java.util.Arrays;

// make own arrayList:

public class arrayList {

    public static class Arraylist{
        int arr[] = new int[1];
        int idx;
        int size = 0;
        public void add(int ele){
            if (size == arr.length) {
                int[] brr = Arrays.copyOf(arr,arr.length*2);
//                arr = new int[brr.length];
//                arr = Arrays.copyOf(brr,brr.length);
                arr = brr;
            }
            arr[idx] = ele;idx++;
            size++;
        }



    }
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(4);
        arr.add(2);
        arr.add(9);
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
    }
}
