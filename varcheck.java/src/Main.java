import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static int SGT[];
    static int arr[];
     static int n;
     static int MOD = (int)1e8;


    static void solve3(String  s) {
        List<Integer> div = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                div.add(i);
                if (n / i != i) {
                    div.add(n / i);
                }
            }
        }
        Collections.sort(div);
        for (int len : div) {
            String check1 = s.substring(0, len);
            String check2 = s.substring(n - len, n);
            int cnt1 = 0, cnt2 = 0;
            for (int j = 0; j < n; j += len) {
                for (int k = j; k < j + len; k++) {
                    if (s.charAt(k) != check1.charAt(k % len)) {
                        cnt1++;
                    }
                    if (s.charAt(k) != check2.charAt(k % len)) {
                        cnt2++;
                    }
                }
            }
            if (cnt1 < 2 || cnt2 < 2) {
                System.out.println(len);
                return;
            }
        }
    }

    static void solve1(int n) {
        List<Integer> v = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < 32; i++) {
            String binary = Integer.toBinaryString(i);
            int num = Integer.parseInt(binary);
            v.add(num);
            st.add(num);
        }
//        for(int i=0; i<32; i++){
//            System.out.println(v.get(i));
//        }
        v.add(1000000);
        for (int i = 0; i < 32; i++) {
            for (int j = 2; j <=32; j++) {
                if (st.contains(n)) {
                    System.out.println("Yes");
                    return;
                } else if (n % v.get(j) == 0 && n >= v.get(j)) {
                    n /= v.get(j);
                }
            }
        }
        if (n == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void solve10(int v[],int n) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(v[i], mp.getOrDefault(v[i], 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
           count+=entry.getValue()/3;
        }
        System.out.println(count);
    }

    static void solve2(long n, long m, long k,long arr[]) {
        long ans = 0;
        for(int i=0; i<n; i++){
            long t = Math.min(m,k);
            ans+=arr[i]*t+(k-t)*t;
            k-=t;
        }
        System.out.println(ans);
    }
    static final int N = 5050;
    static final int MOD1 = 998244353;
    public static void main(String[] args) {
        FastReader fs = new FastReader();
//        int test = 1;
//        test = fs.nextInt();
//        while(test-->0) {
//            long  n =fs.nextInt();
//            long  m = fs.nextInt();
//            long  k = fs.nextInt();
//           long[]v = new long[(int)n];
//           for(int i=0; i<n; i++){
//               v[i] = fs.nextInt();
//           }
//           Arrays.sort(v);
//           solve2(n,m,k,v);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int t = fs.nextInt();



        int t = 1;
        t = fs.nextInt();
        while (t-- > 0) {
            int n1 = fs.nextInt();
            int[] arr = new int[n1];
            for(int i=0; i<n1; i++){
                arr[i] = fs.nextInt();
            }
            solve10(arr,n1);

        }

    }
    static class FastReader {   // taking input from this
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextArray(int n) {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextInt();
            return arr;
        }
    }
    static int largestPower(int n, int p) {
        // Initialize result
        int x = 0;

        // Calculate x = n/p + n/(p^2) + n/(p^3) + ....
        while (n > 0) {
            n /= p;
            x += n;
        }
        return x;
    }
    static int largestFac(int n) { // largest factorial of n
        int c = 1;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                c = i;
        return c;
    }


    static long iGCD(long x, long y) {
        if (y == 0) return x;
        return iGCD(y, x % y);
    }

    static long lcm(long a, long b) {  // lcm of the number a and b
        long lcm = (a * b) / iGCD(a, b);
        return lcm;
    }
    static int power(int x, int y, int p) {
        int res = 1; // Initialize result
        x = x % p; // Update x if it is more than or
        // equal to p
        while (y > 0) {
            // If y is odd, multiply x with result
            if (y % 2 == 1) {
                res = (res * x) % p;
            }

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }
    private static boolean[] seiveOfErathesos(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {

            prime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }
    static boolean arraySortedInc(int arr[], int n) {

        // Array has one or no element
        if (n == 0 || n == 1)
            return true;

        for (int i = 1; i < n; i++)

            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return false;

        // No unsorted pair found
        return true;
    }
    static boolean arraySortedDec(int arr[], int n) {

        // Array has one or no element
        if (n == 0 || n == 1)
            return true;

        for (int i = 1; i < n; i++)

            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return false;

        // No unsorted pair found
        return true;
    }

    static int modFact(int n, int p) {
        if (n >= p) {
            return 0;
        }
        int res = 1;
        // Use Sieve of Eratosthenes to find all primes
        // smaller than n
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Consider all primes found by Sieve
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                // Find the largest power of prime 'i' that divides n
                int k = largestPower(n, i);

                // Multiply result with (i^k) % p
                res = (res * power(i, k, p)) % p;
            }
        }
        return res;
    }



    static int left(int index) {
        return 2 * index;
    }

    static int right(int index) {
        return 2 * index + 1;
    }

    static int default_value() {
        return Integer.MAX_VALUE;
    }

    static int merge(int left, int right) {
        return Math.min(left,right); // merge left node and right node
    }

    

    static void buildSegmentTree(int start, int end, int index, int SGT[], int arr[]) {
        if (start == end) {
            SGT[index] = (arr[start])%MOD;
            return;
        }
        int mid = (start + end) / 2;
        buildSegmentTree(start, mid, left(index), SGT, arr);  // return the value of left subtree
        buildSegmentTree(mid + 1, end, right(index), SGT, arr);  // return the value of right subtree
        SGT[index] = (merge(SGT[left(index)], SGT[right(index)]))%MOD;
    }

    static void update(int start, int end, int index, int SGT[], int pos, int val) {
        if (start == end) {
            SGT[index] = val;
            return;
        }
        int mid = (start + end) / 2;
        if (pos <= mid) {
            update(start, mid, left(index), SGT, pos, val);
        } else {
            update(mid + 1, end, right(index), SGT, pos, val);
        }
        SGT[index] = (merge(SGT[left(index)], SGT[right(index)]))%MOD;
    }

    static int query(int start, int end, int index, int SGT[], int l, int r) {
        // complete overlap
        // [l......start.....end.....r]
        if (l <= start && r >= end) {
            return SGT[index];
        }
        // disjoint
        // [start.....end....l...r...] or [l...r.....start....end]
        if (r < start || end < l) {
            return default_value();
        }
        int mid = (start + end) / 2;
        int leftAns = query(start, mid, left(index), SGT, l, r);
        int rightAns = query(mid + 1, end, right(index), SGT, l, r);
        return (merge(leftAns,rightAns))%MOD;
    }
    static void solve() {
        Main.FastReader fs = new Main.FastReader();
        n = fs.nextInt();
        arr = new int[n];
        SGT = new int[4*n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
        }

        buildSegmentTree(0, n - 1, 1, SGT, arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        update(0,n-1,1,SGT,2,3);
        System.out.println(query(0, n - 1, 1, SGT, 2, 7));
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:SGT){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}

