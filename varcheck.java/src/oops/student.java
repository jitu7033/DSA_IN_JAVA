package oops;

import java.util.Scanner;

public class student {



    public static void change(students s){
        s.name = "jitendra";
        System.out.println(s.name);

    }

    // thorough function call class

    //user define class are call by reference and change the value;
    public static void fun(students s){
        System.out.println(s.name);
//        System.out.println(s.rollNo);
        System.out.println(s.percent);
    }



    //creating a new data type;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        students s = new students();
//        s.name = sc.next();
        s.rollNo = 78;
        s.percent = 99.5;
//        System.out.println(s.name);
//        fun(s);
//        change(s);
        // getter function
//        System.out.println(s.getRollNo());

        // using the setter function
        s.setRollNo(76);
//        System.out.println(s.getRollNo());// print the roll no;


        s.setName("Sunil");
//        System.out.println(s.getName());

        // use of static
        students s1 = new students("ram",76,98.3);
        students s2 = new students("shyam",79,96.3);
//        students s3 = new students(sc.next(),sc.nextInt(),sc.nextDouble());
        System.out.println(students.getNoOfStudents());
//        System.out.println(s1.name+" "+s1.rollNo+" "+s1.percent);
//        System.out.println(s3.name+" "+s3.rollNo+" "+s3.percent);
//        System.out.println(s2.name);
    }
}
