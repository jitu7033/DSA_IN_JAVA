package android.devodroid;

public class interfarance implements Animal{

    @Override
    public void eat() {
        System.out.println("mammal eats");
    }

    @Override
    public void travel() {
        System.out.println("mammal travel");

    }

    public static void main(String[] args) {
        interfarance m = new interfarance();
        m.eat();
        m.travel();
    }
}
interface Animal{
    public void eat();
    public void travel();
}