public class live {
    static void  solve(long arr[],long k){
        int n = arr.length;
        long count = 0;
        long last = n-1;
        for(int i=0; i<n; i++){
            if(arr[i]==arr[0]){
                count++;
            }
            if (count == k){
                last = i;
                break;
            }
        }

        if(count<k){
            System.out.println("No");
            return;
        }
        else{
            if(arr[0]==arr[n-1]){
                System.out.println("Yes");
                return;
            }
        }
        count = 0;
        for(int i=n-1; i>last; i--){
            if(arr[i]==arr[n-1]){
                count++;
            }
        }
        if(count>=k){
            System.out.println("Yes");
            return;
        }
        else{
            System.out.println("No");
            return;
        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextLong();
        for (int te = 0; te < test; te++) {
//
            long n = sc.nextLong();
//            long m = sc.nextLong();
            long k = sc.nextLong();
//            long h = sc.nextLong();
////
//            String s = sc.next();
            long arr[] = new long[(int)n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextLong();
            }
//            solve3(arr,n);
//            printArray(arr);
//            solve1(s,k);
            solve(arr, k);
//            System.out.println();
//            solve1(arr,n,m,k,h);
        }

    }
}

    }
}
