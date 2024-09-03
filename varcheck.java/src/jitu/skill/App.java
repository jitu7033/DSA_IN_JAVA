package jitu.skill;

public class App {

    public String str_1 = "i m a public member";


    void printFromClass(){
        System.out.println("within class "+str_1);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.printFromClass();
        System.out.println(obj.str_1);

        App2 obj1 = new App2();
        obj1.outsideTheClass();


    }

}


class App2{

    void outsideTheClass(){
        App obj = new App();
        System.out.println("within class on outside the object: "+ obj.str_1);
    }

}
