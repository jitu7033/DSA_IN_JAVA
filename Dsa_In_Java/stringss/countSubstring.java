package stringss;




public class countSubstring {

    public static boolean checkPalindrome(String s){
        int i=0; int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;

        }
        return true;
    }

    public static void CountSubString(String str){
        int count = 0;
        for(int i=0; i<=str.length()-1; i++){
            for(int j=i+1; j<=str.length(); j++){
               if(checkPalindrome(str.substring(i,j))==true){
                   System.out.println(str.substring(i ,j)+" ");
                   count++;
               }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str = "01";
        CountSubString(str);

    }
}
