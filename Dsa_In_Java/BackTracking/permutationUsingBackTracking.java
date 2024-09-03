package BackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutationUsingBackTracking {
    public static void permutation(int arr[],List<List<Integer>>ans,List<Integer> ds,boolean[]isValid){
        if(ds.size()==arr.length){
            List<Integer>list = new ArrayList<>();
            for(int i=0; i<ds.size(); i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(isValid[i]==false){
                ds.add(arr[i]);
                isValid[i] = true;
                permutation(arr,ans,ds,isValid);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public static void permutationSecond(int arr[],List<List<Integer>>ans,int idx){
        int n = arr.length;
        if(idx==n-1){
            List<Integer>l = new ArrayList<>();
            for(int i=0; i<n; i++){
                l.add(arr[i]);
            }
            ans.add(l);
            return;
        }
        for(int i=idx; i<n; i++){
            swap(i,idx,arr);
            permutationSecond(arr,ans,idx+1);
            swap(i,idx,arr);
        }
    }
    public static void swap(int i, int j, int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> ds = new ArrayList<>();
//        boolean isValid[] = new boolean[arr.length];
//        permutation(arr,ans,ds,isValid);
        permutationSecond(arr,ans,0);
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
