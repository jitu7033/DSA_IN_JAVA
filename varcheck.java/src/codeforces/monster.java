package codeforces;

import java.util.Scanner;

//import static sun.awt.SunGraphicsCallback.log;

public class monster {


    static void monsterGame(long myAttack, long myHealth , long monAttack, long monHealth,long k, long attack, long health ) {
        boolean flag = false;
        for(long i=0; i<=k; i++){
            long nh = myHealth+(i*health);
            long na = myAttack+((k-i)*attack);
            long timeToKill = (monHealth)/na;
            if(monHealth%na!=0) timeToKill++;
            long timeToGetKilled = nh/(monAttack);
            if(nh%monAttack!=0) timeToGetKilled++;

            if(timeToKill<=timeToGetKilled){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
       else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            long t = sc.nextInt();
            for(long i=0; i<t; i++){

                long myHealth = sc.nextInt();
                long myAttack = sc.nextInt();
                long monHealth = sc.nextInt();
                long monAttack = sc.nextInt();
                long k = sc.nextInt();
                long attack = sc.nextInt();
                long health = sc.nextInt();
                monsterGame(myAttack ,myHealth ,monAttack,monHealth, k,attack,health );
            }
    }
}
