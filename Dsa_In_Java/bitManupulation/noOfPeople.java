package bitManupulation;

import javax.security.sasl.SaslClient;
import java.util.*;

//import static hashset.question.solution;

public class noOfPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nOfSkill = sc.nextInt();
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i=0; i<nOfSkill; i++){
            mp.put(sc.next(),i);
        }
        int np = sc.nextInt();
        int []people = new int[np];
        for(int i=0; i<np; i++) {
            int personSkill = sc.nextInt();
            for (int j = 0; j < personSkill; j++) {
                String skill = sc.next();
                int sNum = mp.get(skill);
                people[i] = people[i] | (1 << sNum);
            }
        }
        solution(people,nOfSkill,0,new ArrayList<>(),0);
        System.out.println(sol);
    }

    static ArrayList<Integer>sol = new ArrayList<>();
    private static void solution(int[] people, int nOfSkill, int cp, ArrayList<Integer> oneSol, int sMask) {
        if(cp==people.length){
            if(sMask==((1<<nOfSkill)-1)){
                if(sol.size()==0 || oneSol.size()<sol.size()){
                    sol = new ArrayList<>(oneSol);
                }
            }
            return;
        }
        solution(people,nOfSkill,cp+1,oneSol,sMask);
        oneSol.add(cp);
        solution(people,nOfSkill,cp+1,oneSol,(sMask | people[cp]));
        oneSol.remove(oneSol.size()-1);
    }
}
