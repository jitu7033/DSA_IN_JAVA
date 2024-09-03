import java.util.ArrayList;
public class wrapper {
    public static void main(String[] args) {
        //Wrapper cLasses
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//        Float f = Float.valueOf(2.8f);
//        System.out.println(f);

        //Arraylist;
        ArrayList<Integer> n = new ArrayList<>();
        // add new element
        n.add(5);
        n.add(6);
        n.add(7);
        n.add(8);

        //indexing
        System.out.println(n.get(0));

        //print with for loop
        for(int i=0; i<n.size(); i++){
            System.out.println(n.get(i));
        }
        System.out.println(n);
        // adding element add some index;

        n.add(1,100);
        System.out.println(n);

        // modifying element at index i ;
        n.set(1,10);
        System.out.println(n);

        //remove the element ;
        n.remove(0);
        System.out.println(n);


        //removing element without using index

        n.remove(Integer.valueOf(7));
        System.out.println(n);

        //boolean ans

        boolean ans = n.contains(Integer.valueOf(5));
        System.out.println(ans);

        //new array mix
        ArrayList l = new ArrayList();
        l.add("jitendra");
        l.add(7);
        l.add(7.6);
        System.out.println(l);


//        ArrayList<Boolean> b = new ArrayList<>();
//        ArrayList<Float> Float =new  ArrayList<>();

    }
}
