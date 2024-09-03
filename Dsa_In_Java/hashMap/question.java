package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class question {
    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq + 1);
            }
        }
        return mp;
    }

    public boolean isAnagram1(String s, String t) {
        HashMap<Character, Integer> map1 = makeFreqMap(s);
        HashMap<Character, Integer> map2 = makeFreqMap(t);
        if (s.length() != t.length()) {
            return false;
        }
        return map1.equals(map2);
    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = makeFreqMap(s);
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!mp.containsKey(ch)) return false;
            int currFreq = mp.get(ch);
            mp.put(ch,currFreq-1);
            if(mp.get(currFreq)==0){
                mp.remove(ch);
            }
        }
        if(mp.size()==0){
            return true;
        }
        return false;
    }
}
