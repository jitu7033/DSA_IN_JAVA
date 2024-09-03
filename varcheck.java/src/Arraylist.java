import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    static void reverseArrayList(ArrayList<Integer> l){
        int i = 0;
        int j = l.size()-1;
        while(i<j) {
            Integer temp = Integer.valueOf(l.get(i));
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(10);
        l.add(7);
        l.add(8);
        l.add(9);
        System.out.println(l);

        Collections.reverse(l);
//        reverseArrayList(l);
        System.out.println(l);

        //sort of array
        Collections.sort(l);
        System.out.println("Ascending order " +l);

        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Descending order "+l);


        //String sort and descending order or ascending order;

        ArrayList<String> s =new ArrayList<>();
        s.add("jitendra");
        s.add("kumar");
        s.add("yadav");

        Collections.sort(s);
        System.out.println(s);

        Collections.sort(s,Collections.reverseOrder());
        System.out.println(s);

    }
}
