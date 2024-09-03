package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class basicHashset {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(19);
        st.add(19);
        st.add(3);
        st.add(9000);
        System.out.println(st);
        // tree set
        TreeSet<Integer>tree = new TreeSet<>();
        tree.add(19);
        tree.add(9);
        tree.add(12);
        System.out.println(tree);
        LinkedHashSet<Integer> link = new LinkedHashSet<>();
        link.add(1);
        link.add(869);
        link.add(-1);
        System.out.println(link);
        System.out.println(tree);
        System.out.println(st);
    }
}
