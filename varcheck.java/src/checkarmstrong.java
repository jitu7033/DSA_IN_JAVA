public class checkarmstrong {
    public static void main(String[] args) {
        int n = 371;
        int lang = 0;
        int t1 = n;
        while(t1!=0){
            t1 = t1/10;
            lang = lang+1;
        }
        int t2 = n;
        int arm = 0;
        while(t2!=0){
            int mul = 1;
            int rem = t2%10;
            for(int i=0; i<lang; i++){
                mul = mul*rem;
            }
            arm+=mul;
            t2 = t2/10;

        }
        if(arm==n){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
