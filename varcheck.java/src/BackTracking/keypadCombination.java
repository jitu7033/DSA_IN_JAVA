public class keypadCombination {
    static void combination(String g, String kp[],String res){
        if(g.length()==0){
            System.out.println(res);
            return;
        }
        int currNum = g.charAt(0)-'0';
        String currChoice = kp[currNum];
        for(int i=0; i<currChoice.length(); i++){
            combination(g.substring(1),kp,res+currChoice.charAt(i));
        }
        return;

    }
    public static void main(String[] args) {
        String g = "23";
        String  kp[] = {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(g,kp,"");
    }
}
