package codeforces;

public class longestRepetation {

    static void longest(String s){
        int max = 1,count = 1 ;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                count =1;
            }
           max =  Math.max(max,count);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        String s = "CGGGAAAA";
        longest(s);

    }
}
