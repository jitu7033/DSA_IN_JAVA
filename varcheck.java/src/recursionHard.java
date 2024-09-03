public class recursionHard {

    static int best(int h[], int n, int idx){
        if(idx==n-1) return 0;

        int opr1 = Math.abs(h[idx+1]-h[idx])+best(h,n,idx+1);
        if(idx==n-2) return opr1;
        int opr2 = Math.abs(h[idx+2]-h[idx])+best(h,n,idx+2);

        int ans = Math.min(opr1,opr2);
        return ans;

    }


    public static void main(String[] args) {
        int h[] = {10,30,20,40,20,70,10};

        System.out.println(best(h,h.length,0));

    }
}
