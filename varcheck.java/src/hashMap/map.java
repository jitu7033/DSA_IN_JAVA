package hashMap;

import java.util.*;

public class map {

    static void hashMapMethod(){
        // syntax
        Map<String,Integer>mp = new HashMap<>();

        // Adding element in hashMap
        mp.put("ram",12);
        mp.put("Kartik",18);
        mp.put("manu",17);
        mp.put("subham",19);
        mp.put("Riya",8);

        // getting value a key from hash map
        // 1. if the key is present then return values
        // 2. if the key is not present then the return null value
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~get~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(mp.get("ram"));
        System.out.println(mp.get("shyam"));

        // put is working two type
        // if key is present in hashmap then you will put the value hen change the value from the values if you want
        // 2. if the is not present then insert the value in the hashmap
        System.out.println("~~~~~~~~~~~~~~~~~~~~Put ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        mp.put("shyam",89);
        mp.put("ram",23);
        System.out.println(mp.get("ram"));
        System.out.println(mp.get("shyam"));

        // remove
        // 1. if the key is not present in hashmap the i remove the key it will return null value
        //2. if the key is present in the hashmap then it will be remove the value
        System.out.println("~```````````````````````````````` Remove ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(mp.remove("ram"));
        System.out.println(mp.remove("jitu"));

        // checking if the key present in the map/\
        System.out.println("~~~~~~~~~~~~~~~checking Key~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(mp.containsKey("shyam"));
        // checking if the value is present in the map;
        System.out.println("~~~~~~~~~~~~~~~~~value check~~~~~~~~~~~~~~~");
        System.out.println(mp.containsValue(89));


        System.out.println("~~~~~~~~~~key present int he hashmap~~~~~~~~~~~~~~~~");
        // get all key in the hashmap
        System.out.println(mp.keySet());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~value in the hashmap~~~~~~~~~~~~~~~~~`");
        // get all the value in the hashmap;
        System.out.println(mp.values());

        System.out.println("~~~~~~~~~~~~get all the entries in the hashmap" );
        // get all the entries int hash map
        System.out.println(mp.entrySet());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`Traverse~~~~~~~~~~~~~~~~~~~~~~~");
        // traverse the hashmap many method ;
        // traverse through the key
        for(String key:mp.keySet()){
            System.out.printf("age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer>x:mp.entrySet()){
            System.out.printf("age of %s is %d\n",x.getKey(),x.getValue());
        }
        System.out.println();

        for(var e:mp.entrySet()){
            System.out.printf("age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();



    }

    static void questionFrequency(long arr[]){
        Map<Long,Long>mp = new HashMap<>();
        for(long x:arr){
            if(!mp.containsKey(x)){
                mp.put(x,1l);
            }
            else{
                mp.put(x,mp.get(x)+1);
            }
        }
        for(var x:mp.entrySet()){
            System.out.printf("%d  %d\n",x.getKey(),x.getValue());
        }
        // max frequency
        long max = -1;
        long ans = 0;
        for(var e:mp.entrySet()){
            if(e.getValue()>max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
//        hashMapMethod();
        long arr[] = {1,2,3,4,5,6,1,2,3,4,5,1,5,5,5};
        questionFrequency(arr);
    }
}
