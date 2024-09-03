package oops;

import static oops.constructor.add;

public class fraction {

//    public static class fractionNo{
//        int num;
//        int dem;
//    }



    public static void main(String[] args) {
        constructor f1 = new constructor(35,21);
        System.out.println(f1.num+"/"+f1.dem);
        constructor f2 = new constructor(7,3);
        constructor f3 = add(f1,f2);
        System.out.println(f2.num+"/"+f2.dem);
        System.out.println(f3.num+"/"+f3.dem);
        f1 = f3;
        System.out.println(f1.num+"/"+f1.dem);
    }
}
