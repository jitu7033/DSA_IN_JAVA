package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;
public class cses {
    public static  void  f(long n){
        long ans = 0;
        for(int i=2; (1l<<i)<=n; i++){
            long l = 1l<<i;
            long r = Math.min(1l<<(i+1),n+1);
            System.out.println("l-->"+l);
            System.out.println("r-->"+r);
            System.out.println("base-->"+i);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        f(8);
    }
}