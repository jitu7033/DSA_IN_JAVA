package oops;

// access
// 1. public -- they use any other package any other class;
// 2. private -- they do not use any other class;
//3. default  --- they do not use any other package ;
public  class students{
    public String name;
    int rollNo;
    double percent;
//    private int rollNo;
//    final static int noOfStudents = 0;
    private static int noOfStudents;

    //Notes
    // setter and getter function use for only private class ;

    //
    // getter function
    public int getRollNo(){
        return rollNo;
    }
    // setter function mean set

    public void setRollNo(int roll){
        rollNo = roll;
    }

    // use this keyboard
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // constructor use for sort the line
    public students(String name, int rollNo, double percent){
        this.name = name;
        this.rollNo = rollNo;
        this.percent = percent;
        noOfStudents++;
    }
    // use constructor not pass any value
    public students(){

    }
    // get no of student using static keyword
    public static int getNoOfStudents(){
        return noOfStudents;
    }
}
