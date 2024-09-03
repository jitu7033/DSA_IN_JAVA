package hashMap;

import java.util.*;

public class mapQuestion {
    static void sumTarget(int arr[],int target,int n){
        HashMap<Integer,Integer>mp = new HashMap<>();
        HashMap<Integer,Integer>mp1 = new HashMap<>();

        for(int i=0; i<n; i++){
            mp.put(arr[i],i);
        }
        for(int i=0; i<n; i++){
            int ans = target-arr[i];
            if(mp.containsKey(ans)){
                mp1.put(i,mp.get(ans));
                break;
            }
        }
        if(mp1.size()==0){
            System.out.println(-1+" "+-1);
        }
        else{
            for(Map.Entry<Integer,Integer>x:mp1.entrySet()){
                System.out.println(x.getKey()+" "+x.getValue());
            }
        }

    }

    static void code(int arr[]){
        HashMap<Integer,Integer>mp = new HashMap<>();
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int max = 0;
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        mp.put(0,-1);
        for(int i=0; i<arr.length; i++){
            int ans = prefix[i];
            if(mp.containsKey(ans)){
                max = Math.max(max,i-mp.get(ans));
//                System.out.println(i);
//                System.out.println(prefix[i]);
            }
            else{
                mp.put(prefix[i],i);
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
//        int target = fs.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n; i++){
            arr[i] = fs.nextInt();
        }
        code(arr);
    }
}
