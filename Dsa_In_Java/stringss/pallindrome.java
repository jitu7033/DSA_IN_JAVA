package stringss;

public class pallindrome {
    public static void main(String[] args) {
        String str = "abcfghjba";
        StringBuilder gtr = new StringBuilder(str);

        int i=0; int j = gtr.length()-1;
        boolean flag = true;
        while(i<=j){
            if(gtr.charAt(i)!=gtr.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true) System.out.println("palindrome");
        else System.out.println("Not Palindrome");

    }
}
