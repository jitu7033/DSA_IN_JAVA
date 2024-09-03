package android.devodroid;

public class android2 extends classA {
    public static void main(String[] args) {
        android2 android2 = new android2();
        android2.cont();

    }

    private void cont() {
        int sum = super.add(7,11);
        System.out.println(sum);

        classB b = new classB();
        int product = b.multiply(7,11);
        System.out.println(product);

    }

}
