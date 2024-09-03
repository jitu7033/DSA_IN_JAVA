package hashMap;

import java.util.HashMap;

public class solution {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character,Character>mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char Sch = s.charAt(i);
            char tCh = t.charAt(i);
            if(mp.containsKey(Sch)){
                if(mp.get(Sch)!=tCh){
                    return false;
                }
            } else if (mp.containsValue(tCh)) {
                return false;
            } else{
                mp.put(Sch,tCh);
            }
        }
        return true;

    }


}
