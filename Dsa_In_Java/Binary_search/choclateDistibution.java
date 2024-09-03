public class choclateDistibution {

    static boolean PossibleDivision(int []a, int m, int maxPossible){
        int choc = 0;
        int nos = 1;
        for(int i=0; i<a.length; i++){
            if(a[i]>maxPossible) return false;
            if(choc+a[i]<=maxPossible){
                choc += a[i];
            }else{
                nos++;
                choc = a[i];
            }
        }
        return nos<=m;

    }

    static int DistributionChoclates(int []a, int m){
        int ans = 0;
        int st = 1; int end = (int) 10e9;

        while(st<=end){
            int mid = st+(end-st)/2;
            if(PossibleDivision(a,m,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }

        }



        return ans;

    }

    public static void main(String[] args) {
        int a[] = {12,34,67,90};
        int m=2;
        System.out.println(DistributionChoclates(a,m));

    }
}
