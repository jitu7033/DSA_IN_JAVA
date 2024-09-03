/*jitu7033
  Auto generated function by Jitendra
  Custom competitive programming helper


                                                 Jay Shri Ram

 */
//import com.sun.security.jgss.GSSUtil;
//import com.sun.source.tree.Tree;

//import javax.naming.InsufficientResourcesException;
//import java.awt.dnd.DragSourceContext;
import java.beans.Introspector;
import java.io.*;
import java.math.BigInteger;
//import java.sql.SQLIntegrityConstraintViolationException;
//import java.sql.SQLOutput;
import java.util.*;
public class test{
    static String ab, b;

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int x) {
            // TODO Auto-generated constructor stub
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // here is my solution   -------------  JGM  --------------------

    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        FastReader fs = new FastReader();
         int T = fs.nextInt();
         while (T-- > 0) {
//        int  n = fs.nextInt();
        long  max = (long) (1e18);
        int  sum = fs.nextInt();
        long arr[] = new long[(int) 5];
        arr = new long[]{1, 3, 6, 10, 15};
        long dp[] = new long[sum+1];
        for(int i=0; i<=sum; i++){
            dp[i] = max;
        }
        dp[0] = 0;
        for(int i=1; i<=5; i++){
            for(int j=0; j<=sum; j++){
                if(j-arr[i-1]>=0){
                    dp[j] = Integer.min((int) dp[j], (int) (dp[(int) (j-arr[i-1])]+1));
                }
            }
        }
//             for(int i=0; i<=sum; i++){
//                 System.out.print(dp[i]+" ");
//             }
        System.out.println();
        if(dp[sum]>=max){
            System.out.println(-1);
        }
        else System.out.println(dp[sum]);

    }
         }
    public static long unboundedMaximumCountSubsetSum(long arr[], long sum){
        long n = arr.length;
        long dp[][] = new long[(int)n+1][(int)sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = 0;
                if(j==0)dp[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i][(int) (j-arr[i-1])]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[(int)n][(int)sum];

    }
    public static boolean unboundedIsSubsetSum(long arr[], long sum){
        long n = arr.length;
        boolean dp[][] = new boolean[(int) (n+1)][(int) (sum+1)];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = false;
                if(j==0)dp[i][j] = true;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i][(int) (j-arr[i-1])]||dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=sum; j++){
//                 System.out.print(dp[i][j]+" ");
//             }
//             System.out.println();
//         }
        return dp[(int)n][(int)sum];
    }
    public static long zeroOneMaximumSubsetSum(long arr[], long sum){
        long n = arr.length;
        long dp[][] = new long[(int)n+1][(int)sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = 0;
                if(j==0)dp[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][(int) (j-arr[i-1])]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[(int)n][(int)sum];
    }
    public static boolean zeroOneIsSubsetSum(long arr[], long sum){
        long n = arr.length;
        boolean dp[][] = new boolean[(int) (n+1)][(int) (sum+1)];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = false;
                if(j==0)dp[i][j] = true;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][(int) (j-arr[i-1])]||dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[(int)n][(int)sum];
    }
    private static void priorityQueue(){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        pq.add(-10);
        pq.add(-3);
        pq.add(-12);
        pq.add(-14);
        pq.add(-14);
        pq.add(-1);
        System.out.println(pq);
        for(int x:pq){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(pq.peek());
        pq.remove(pq.peek());
        System.out.println(pq.peek());
        pq.remove(pq.peek());
        System.out.println(pq.peek());
        pq.remove(pq.peek());
        System.out.println(pq.peek());
        for(int x:pq){
            System.out.print(x+" ");
        }
    }
    static class Pair<U, V> implements Comparable<Pair<U, V>> {
        public U x;
        public V y;

        public Pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Pair<U, V> o) {
            int value = ((Comparable<U>) x).compareTo(o.x);
            if (value != 0) return value;
            return ((Comparable<V>) y).compareTo(o.y);
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return x.equals(pair.x) && y.equals(pair.y);
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

    }


    static class FastReader {
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

    static String string;

    static int gcd(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        return gcd(b, a % b);
    }
    static long gcd(long a, long b) {
        // Everything divides 0

        for (long i = 2; i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    static int fac(int n) {
        int c = 1;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                c = i;
        return c;
    }
    static long lcm(long a, long b) {
        long lcm = (a * b) / iGCD(a, b);
        return lcm;
    }
    static int maxHeight(char[][] ch, int i, int j, String[] arr) {
        int h = 1;
        if (i == ch.length - 1 || j == 0 || j == ch[0].length - 1)
            return 1;
        while (i + h < ch.length && j - h >= 0 && j + h < ch[0].length && ch[i + h][j - h] == '*' && ch[i + h][j + h] == '*') {
            String whole = arr[i + h];
            //System.out.println(whole.substring(j-h,j+h+1));
            if (whole.substring(j - h, j + h + 1).replace("*", "").length() > 0)
                return h;
            h++;
        }

        return h;
    }

    static boolean all(BigInteger n) {
        BigInteger c = n;
        HashSet<Character> hs = new HashSet<>();
        while ((c + "").compareTo("0") > 0) {
            String d = "" + c;
            char ch = d.charAt(d.length() - 1);
            if (d.length() == 1) {
                c = new BigInteger("0");

            } else
                c = new BigInteger(d.substring(0, d.length() - 1));
            if (hs.contains(ch))
                continue;
            if (d.charAt(d.length() - 1) == '0')
                continue;
            if (!(n.mod(new BigInteger("" + ch)).equals(new BigInteger("0"))))
                return false;
            hs.add(ch);
        }
        return true;
    }

    static int cal(long n, long k) {
        System.out.println(n + "," + k);
        if (n == k)
            return 2;
        if (n < k)
            return 1;
        if (k == 1)
            return 1 + cal(n, k + 1);
        if (k >= 32)
            return 1 + cal(n / k, k);
        return 1 + Math.min(cal(n / k, k), cal(n, k + 1));
    }

    static Node buildTree(int i, int j, int[] arr) {
        if (i == j) {

            //System.out.print(arr[i]);
            return new Node(arr[i]);
        }
        int max = i;
        for (int k = i + 1; k <= j; k++) {
            if (arr[max] < arr[k])
                max = k;
        }
        Node root = new Node(arr[max]);
        //System.out.print(arr[max]);
        if (max > i)
            root.left = buildTree(i, max - 1, arr);
        else {
            root.left = null;
        }
        if (max < j)
            root.right = buildTree(max + 1, j, arr);
        else {
            root.right = null;
        }
        return root;
    }

    static int height(Node root, int val) {
        if (root == null)
            return Integer.MAX_VALUE - 32;
        if (root.val == val)
            return 0;
        if ((root.left == null && root.right == null))
            return Integer.MAX_VALUE - 32;
        return Math.min(height(root.left, val), height(root.right, val)) + 1;
    }

    static void shuffle(int a[], int n) {
        for (int i = 0; i < n; i++) {

            // getting the random index
            int t = (int) Math.random() * a.length;

            // and swapping values a random index
            // with the current index
            int x = a[t];
            a[t] = a[i];
            a[i] = x;
        }
    }

    static void sort(int[] arr) {
        shuffle(arr, arr.length);
        Arrays.sort(arr);
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

    // Utility function to do modular exponentiation.
    // It returns (x^y) % p
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

    // Returns n! % p
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

    static boolean[] seiveOfErathnos(int n2) {
        boolean isPrime[] = new boolean[n2 + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n2; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n2; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    static boolean[] seiveOfErathnos2(int n2, int[] ans) {
        boolean isPrime[] = new boolean[n2 + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n2; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n2; j += i) {
                    if (isPrime[j])
                        ans[i]++;
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    static int calculatePower(PriorityQueue<Integer>[] list, int[] alive) {
        //    	List<Integer> dead=new ArrayList<>();
        for (int i = 1; i < alive.length; i++) {
            if (alive[i] == 1) {
                if (list[i].size() == 0) {
                    continue;
                }
                if (list[i].peek() > i) {
                    //    				dead.add(i);
                    //    				System.out.println(i);
                    alive[i] = 0;
                    for (int j : list[i]) {
                        //            			list[i].remove((Integer)j);
                        list[j].remove((Integer) i);
                    }
                    list[i].clear();
                    return 1 + calculatePower(list, alive);
                }
            }
        }
        return 0;
    }

    static boolean helper(int i, int j, int[] index, int k, HashMap<String, String> hm) {
        //    	System.out.println(i+","+j);
        if (k <= 0)
            return false;
        if (i == j)
            return true;
        String key = i + "," + j;
        if (hm.containsKey(key)) {
            String[] all = hm.get(key).split(",");
            int prev = Integer.parseInt(all[0]);
            //    		String val=Integer.parseInt(all[1]);
            if (prev == k)
                return all[1].equals("true") ? true : false;
            else if (prev > k && all[1].equals("false"))
                return false;
            else if (prev < k && all[1].equals("true"))
                return true;
        }

        if (i + 1 == j) {
            if (index[i] + 1 == index[j] || k >= 2)
                return true;
            return false;
        }
        boolean flag = false;
        for (int p = i; p < j; p++) {
            if (index[p] + 1 != index[p + 1]) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            hm.put(key, k + "," + true);
            return true;
        }
        if (k == 1) {
            hm.put(key, k + "," + false);
            return false;
        }
        for (int p = i; p < j; p++) {
            if (helper(i, p, index, k - 1, hm) && helper(p + 1, j, index, k - 1, hm)) {
                hm.put(key, k + "," + true);
                return true;
            }
        }
        hm.put(key, k + "," + false);
        return false;
    }

    static int set(int[] arr, int start) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += Math.abs(start - i);
                start += 2;
            }
        }
        return count;
    }

    static int solution(long first, long second, long index) {
        if (index == 1) {
            return 1;
        }
        long newfirst = second - first;
        if (newfirst > first) {
            return 0;
        }
        long ans = 0;
        ans += solution(newfirst, first, index - 1);
        return (int) ans;
    }

    static long iGCD(long x, long y) {
        if (y == 0) return x;
        return iGCD(y, x % y);
    }

    static long findMex(long arr[]) {
        Arrays.sort(arr);
        boolean flag = false;
        long mex = 0;
        if (arr[0] != 0) {
            mex = 0;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (Math.abs(arr[i] - arr[i + 1]) > 1) {
                    mex = arr[i] + 1;
                    //                        System.out.println(mex);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                mex = arr[(int) (arr.length - 1)] + 1;
            }

        }
        return mex;
    }

    static void bubbleSort(long[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap 2 no
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
        for (long x : arr) {
            System.out.print(x + " ");
        }

    }

    static boolean checkPrime(long n) {
        long i, m = 0, flag = 0;
        boolean ans = false;

        m = n / 2;
        if (m == 0 || n == 1) {
            ans = false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    ans = false;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                ans = true;
            }
        }
        return ans;

    }

    static int div(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static void maxCost(int n, int a, int b, String st) {
        int counterOne = 0, counterZero = 0;
        char last = st.charAt(0);
        if (last == '1') {
            counterOne++;
        } else {
            counterZero++;
        }
        for (int i = 1; i < n; i++) {
            if (last != st.charAt(i)) {
                last = st.charAt(i);
                if (last == '1') {
                    counterOne++;
                } else {
                    counterZero++;
                }
            }
        }
        int ans2 = (a * n) + (Math.min(counterOne, counterZero) * b) + b;
        int ans = (a * n) + (n * b);
        System.out.println(Math.max(ans, ans2));
    }

    static int checkGood(StringBuilder sb, int l, int r) {
        while (l <= r) {
            if (sb.charAt(l) == sb.charAt(r)) {
                return l;
            }
            l++;
            r--;
        }
        return -1;
    }

    public static boolean decimalSum(int n, int k) {
        int rem = 0;
        int len = 0;
        while (n > 0) {
            rem += n % 10;
            n /= 10;
        }
        if (rem % k == 0) {
            return true;
        }
        return false;
    }

    public static int count(int zero, String s) {
        int cOne = 0;
        int len = s.length();
        int ans = 0;
        while (zero > 0) {
            for (int i = len - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    cOne++;
                } else {
                    ans += cOne;
                    zero--;
                }
                if (zero == 0) return ans;
            }
        }
        return ans;
    }

    public static List<Long> swapTwoArray(long arr[]) {
        int n = arr.length;
        int x = (int) arr[(int) (n - 1)];
        ArrayList<Long> ans = new ArrayList<>();
        for (int i = arr.length - x; i < n; i++) {
            ans.add(arr[i]);
        }
        for (int i = 0; i < arr.length - x; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }

    public static void display(ArrayList<Long> arr) {
        for (long x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static boolean lucky(long n, int d) {
        String d1 = String.valueOf(d);
        char ch = d1.charAt(0);
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
    static void twoDInput(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        // Input the matrix
        char[][] matrix = new char[n][n];
        for (int j = 0; j < n; j++) {
            matrix[j] = scanner.nextLine().toCharArray();
        }
    }

    private static class PairList {
        int a, b;
        public PairList(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public String toString() {
            return "(" + a + ", " + b + ")";
        }
    }
    static void sangreek(long n, long arr[],long k){
        ArrayList<Long>ans = new ArrayList<>();
        if(arr[1]!=1) {System.out.println(1);return;}
        arr[((int) n) + 1] = (long) 1e18;
        boolean flag = true;
        long cnt = 1;
        long d = 1;
        for(int i=2; i<=n+1; i++){
            while(cnt+d<arr[i]){
                cnt+=d;
                ans.add(cnt);
                if(ans.size()>k){
                    System.out.println(ans.get((int)k-1));
                    return;
                }
            }
            d = i;
        }
    }
}
