import java.util.Scanner;

public class permutation {

        public static void permutationString(String str, String t){
            if(str.equals("")){
                int n = Integer.parseInt(t);
                if(n%3==0){
                    System.out.print(n+" ");
                }
                return;
            }
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                String left = str.substring(0,i);
                String right = str.substring(i+1);
                String rem = left+right;
                permutationString(rem,t+ch);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
            String str = sc.next();
            permutationString(str,"");
//        System.out.println(permutation(3,3));
        }
}
