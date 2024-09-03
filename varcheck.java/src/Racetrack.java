public class Racetrack {

    static boolean isPossible(int[]a, int k ,int minPossible){

        int kids = 1;
        int last = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]-last>=minPossible){
                kids++;
                last = a[i];
            }
        }


        return kids>=k;
    }

    static int racetrack(int []a, int k){
        int ans = -1;
        int st  = 1;
        int end = (int) 10e9;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(isPossible(a,k,mid)){
                ans = mid;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        int a[] = {2,4,8,9,10};
        int k = 3;
        System.out.println(racetrack(a,k));
    }
}
