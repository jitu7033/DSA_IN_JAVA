public class ArrayString {
    public static void main(String[] args) {
        String arr[] = {"jitu","ram","rohan"};
        String arr1[] = {};
        for(String i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        arr1 = arr;
        for(String x: arr1){
            System.out.print(x+" ");
        }
    }
}
