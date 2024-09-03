package oops;

import java.sql.Struct;

public class struct {
    String  name;
    int rollno;

    public static void  display(struct s){
//        System.out.println(s.rollno);
//        System.out.println(s.name);
    }

    public static void main(String[] args) {
        struct s1 = new struct();
       s1.name = "jitendra";
       s1.rollno =1720 ;
//     System.out.println(s1.name);
//        System.out.println(s1.rollno);
        display(s1);
    }

}