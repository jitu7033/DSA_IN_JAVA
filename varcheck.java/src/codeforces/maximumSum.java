package codeforces;

import java.util.*;

//import static javax.swing.table.DefaultTableModel.gcd;

public class maximumSum {

    static int[] prefixSum(int arr[]) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }
        return prefix;
    }

    static void prefixSum1(long arr[]) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = (int) arr[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(prefix[i - 1], max);
            prefix[i] = (int) (max + arr[i]);
        }
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();
    }

    //    static void sum(int[] arr) {
//        int neg = 0;
//        long sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                neg++;
//                arr[i] = -arr[i];
//            }
//            sum += arr[i];
//        }
//        Arrays.sort(arr);
//        if (neg % 2 != 0) sum -= 2 * arr[0];
//        System.out.println(sum);
//
//    }
//
//    static int Gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return Gcd(b, a % b);
//    }
//
//    static void almostAllDivisor(ArrayList<Long> arr) {
//        Collections.sort(arr);
//        int n = arr.size() - 1;
//        long x = arr.get(0) * arr.get(n);
//        ArrayList<Long> arr1 = new ArrayList<Long>();
//        for (int i = 2; i * 1l * i <= x; i++) {
//            if (x % i == 0) {
//                arr1.add((long) i);
//                if (i != x / i) {
//                    arr1.add(x / i);
//                }
//            }
//        }
//        Collections.sort(arr1);
//        if (arr1.equals(arr)) {
//            System.out.println(x);
//        } else {
//            System.out.println("-1");
//        }
//    }
//
//    static boolean checkPrime(int n) {
//        if (n == 1 || n == 0) {
//            return false;
//        }
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//
//        }
//        return true;
//    }
//
//    static void prime(int n, int k) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (checkPrime(i)) {
//                arr.add(i);
//            }
//        }
//        int count = 0;
//        for (int i = 1; i < arr.size(); i++) {
//            int sum = arr.get(i - 1) + arr.get(i) + 1;
//            if (checkPrime(sum)) {
//                if (sum <= n) {
//                    count++;
//                }
//            }
//        }
//        if (count >= k) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//
//    static void divisors(long n) {
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                if (i % 2 == 0) {
//                    count++;
//
//                }
//            }
//        }
//        System.out.println(count);
//    }
//
//    static void modulo(long a, long b) {
////        long ans = n*k;
////        double ans1 = Math.round((n*k)/5.0);
////        System.out.println(n*k/5.0);
////        System.out.println((long)ans1);
//        long ans = 0;
//        long n = Math.min(a, b);
//        long m = Math.max(a, b);
//        for (long i = 1; i <= m; ++i) {
//            if (5 - (i % 5) <= n) {
//                long x = 5 - (i % 5);
//                long lgx = i - (i % 5);
//                long lgxb = (n + i) - ((n + i) % 5);
//                ans += (lgxb / 5 - lgx / 5);
//            }
//        }
//        System.out.println(ans);
//    }
//
//    static void nearly(long a, long b) {
////        long max = Math.max(a,b);
////        long mul = a*b;
////        long ans1 = a;
////        long ans2 = a*b;
////        long ans3 = ans1+ans2;
////        if(ans1<=10e17) {
////            System.out.println("Yes");
////            System.out.println(ans1 + " " + ans2 + " " + ans3);
////        }
////        else{
////            System.out.println("No");
////        }
//
//        if (b == 1) {
//            System.out.println("No");
//        } else {
//            long ans = a * b;
//            long ans1 = a * (b + 1);
//            long ans2 = a * (b + b + 1);
//            System.out.println("yes");
//            System.out.println(ans + " " + ans1 + " " + ans2);
//        }
//
//    }
//
//    static void fadiLcm(long n) {
//        long ans = 1;
//        long minmax = n;
//        long ans2 = n;
//
//        for (long i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//                if (n / i < minmax && GcdLong(i, n / i) == 1) {
//                    minmax = n / i;
//                    ans = i;
//                    ans2 = n / i;
//                }
//            }
//        }
//        System.out.println(ans + " " + ans2);
//
//
//    }
//
//    static void modlu(long n) {
//        for (int i = 1; i < n; i++) {
//            if (i % 8 == 0) {
//                System.out.println(i + " " + n / i);
//            }
//        }
//    }
//
//    private static Long GcdLong(long a, long b) {
//        if (b == 0) {
//            return a;
//        }
//        return GcdLong(b, a % b);
//    }
//
//    static boolean checkPrimes(int n) {
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        if (n <= 1) {
//            return false;
//        }
//        return true;
//    }
//
//    static void differentDivisor(long n) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        long l = 0;
//        long mul = 1;
//        int count = 0;
//        for (int i = (int) (1 + n); count < 2; i++) {
//            if (checkPrimes((int) i)) {
//                arr.add((int) i);
//                i = (int) (i + n - 1);
//                count++;
//            }
//        }
//        for (int i = 0; i < arr.size(); i++) {
//            mul *= arr.get(i);
//
//        }
//        System.out.println(mul);
//
//
////        ArrayList<Integer> arr = new ArrayList<>();
////        for(int i=1; i<3*i; i++){
////            arr.add(i);
////        }
////        long mul = 1;
////        for(int i=0; i<arr.size(); i++){
////            mul*=arr.get(i);
////        }
////        for(int i=0; i<arr.size(); i++){
////            System.out.println(arr.get(i));
////        }
////        System.out.println(mul);
//////        System.out.println(ans);
//    }
//
    static long iGCD(long x, long y) {
        if (y == 0) return x;
        return iGCD(y, x % y);
    }
//
//    static void excitement(long x, long y) {
//        if (x == y) {
//            System.out.println(0 + " " + 0);
//        } else {
//            long a = Math.abs(x - y);
//            long b = Math.min(x % a, a - x % a);
//            System.out.println(a + " " + b);
//        }
//
//    }
//
//    static void contest(long n, long x, long t1) {
//        long counts = 0;
//        long tx = t1 / x;
//        if (tx >= n) {
//            counts = n - 1;
//        } else {
//            counts = tx;
//        }
//        long ans = counts * (n - counts);
//        long ans2 = (counts * (counts - 1)) / 2;
//        System.out.println(ans + ans2);
//
//    }
//
//    static void GCDProblem(long n) {
////        long c = 0;
////        long a = 0;
////        long b = 0;
////        for(int i=1; i<n; i++){
////            for(int j=1; j<n; j++){
////                for(int k=1; k<n; k++){
////                    if(i+j+k==n && (iGCD(i,j)==k)){
////                        a = i;
////                        b = j;
////                        c = k;
////                        return;
////                    }
////                }
////
////            }
//////        }
////       System.out.println(a+" "+b+" "+c);
////        ArrayList<Integer>arr = new ArrayList<>();
////        for(int i=2; i*i<n; i++){
////            if(i%2==0)
////        }
//
//        if (n % 2 == 0) {
//            long a = n / 2;
//            long b = n / 2 - 1;
//            System.out.println(a + " " + b + " " + 1);
//        } else {
//            long s = n / 2 + 1;
//            long s1 = n / 2 - 1;
//            while (true) {
//                if (iGCD((int) s, (int) s1) == 1) {
//                    System.out.println(s + " " + s1 + " " + 1);
//                    break;
//                }
//                s++;
//                s1--;
//            }
//        }
//    }
//
//    static void underRoot(long n) {
//        long r = -1;
//        long st = 0;
//        long end = n;
//        while (st <= end) {
//            long mid = st + (end - st) / 2;
//            if (mid * mid < n) {
//                r = mid;
//                st = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        System.out.println(r);
//
//
//    }
//
//    static void stringBalance(StringBuilder s) {
//        if (s.length() == 1) {
//            System.out.println(s);
//            return;
//        }
//        System.out.println(s.substring(1) + s.charAt(s.length() - 1));
//    }
//
//    static void exceptSelf(long arr[]) {
//        long n = arr.length;
//        long arr1[] = new long[(int) n];
//        arr1[0] = 1;
//        for (int i = 1; i < n; i++) {
//            arr1[i] = (int) (arr1[i - 1] * arr[i - 1]);
//        }
//        long right = 1;
//        for (int j = (int) (n - 1); j >= 0; j--) {
//            arr1[j] = arr1[j] * right;
//            right = right * arr[j];
//        }
//        System.out.println(right);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
//
//
//    }
//
//    static void theater(long n, long k, long x) {
//        long ans1 = (n + x - 1) / x;
//        long ans2 = (k + x - 1) / x;
//        System.out.println(ans1 * ans2);
//
//    }
//
//    static void makeIncreasing(long arr[]) {
//        int count = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i - 1] > arr[i]) {
//                arr[i - 1] = arr[i - 1] / 2;
//                count++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println(count);
//    }
//
//    static void array(ArrayList arr) {
//        Collections.sort(arr);
//        ArrayList<Long> arr1 = new ArrayList<>();
//        arr1.add((Long) arr.get(0));
//        long ans = (long) arr.get(0);
//        for (int i = 1; i < arr.size(); i++) {
//            long temp = (long) arr.get(i) - (long) arr.get(i - 1);
//            if (ans < temp) ans = temp;
//            arr1.add(temp);
//        }
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
//        for (int i = 0; i < arr1.size(); i++) {
//            System.out.println(arr.get(i));
//        }
//        System.out.println(ans);
//
//
//    }
//
//    static void minimumExtraction(long arr[]) {
//        Arrays.sort(arr);
//        long ans = arr[0];
//        for (int i = 0; i < arr.length - 1; i++) {
//            ans = Math.max(ans, arr[i + 1] - arr[i]);
//        }
//        System.out.println(ans);
//    }
//
//    static void minimum(long arr[]) {
//        Arrays.sort(arr);
//        long ans = (long) -10e9;
//        long sum = 0;
//        for (long i = 0; i < arr.length; i++) {
//            long x = arr[(int) i] - sum;
//            ans = Math.max(ans, x);
//            sum += x;
//        }
//        System.out.println(ans);
//    }
//
//    static void keyboard(String s) {
//        int n = s.length();
////        if(n==1){
////            System.out.println("yes");
////            return;
////        }
////        if(n==2){
////            System.out.println("no");
////            return;
////        }
////        for(int i=0; i<n;  ){
////            if(i%3!=0){
////                if(s.charAt(i)==s.charAt(i+1)){
////                    i+=2;
////                }
////                else{
////                    System.out.println("no");
////                    return;
////                }
////            }
////            else
////                ++i;
////        }
////        System.out.println("yes");
////        return;
//        boolean flag = true;
//        for (int i = 1; i <= n - 1; i += 3) {
//            if(n-i==1){
//                System.out.println("No");
//                return;
//            }
//            if (s.charAt(i) != s.charAt(i + 1)) {
////                System.out.println(s.charAt(i));
//                flag = false;
////                System.out.println("No");
//                break;
//            }
//        }
//        if (flag)
//            System.out.println("yes");
//        else
//            System.out.println("no");
//    }
//
//    static void evenOdd(long a, long b) {
//        if (a == b) {
//            System.out.println("0");
//            return;
//        }
//        if (a < b) {
//            if ((a % 2 != 0 && b % 2 != 0) || (a % 2 == 0 && b % 2 == 0)) {
//                System.out.println("2");
//                return;
//            } else {
//                System.out.println("1");
//                return;
//            }
//        } else {
//            if ((a % 2 != 0 && b % 2 != 0) || (a % 2 == 0 && b % 2 == 0)) {
//                System.out.println("1");
//                return;
//            } else {
//                System.out.println("2");
//                return;
//            }
//        }
//    }
//    static void theaterK(long n, long k, long x){
//        long ans1 = 0;
//        long ans2  =0;
//        if(k%x==0){
//            ans1 = k/x;
//        }
//        else{
//            ans1 = k/x+1;
//        }
//        if(n%x==0){
//            ans2 = n/x;
//        }
//        else{
//            ans2 = n/x+1;
//        }
//        System.out.println(ans1*ans2);
//
//
//    }
//
//    static  void longComparison(long a, int  p1, long b, int  p2) {
//       long min = Math.min(p1,p2);
//       p1 -=min;
//       p2 -= min;
//       if(p1>=7){
//           System.out.println('>');
//       }
//       else if(p2>=7){
//           System.out.println('<');
//        }
//     for(int i=0; i<p1; i++){
//         a*=10;
//     }
//     for(int j=0; j<p2; j++){
//         b*=10;
//     }
////        long a1 = (long) Math.pow(10,p1);
////        long b1 = (long) Math.pow(10,p2);
////        a *= a1;
////        b *= b1;
//
////        a = (long) (Math.log(a)*Math.log(a1));
////        b = (long) (Math.log(b)*Math.log(b1));
////        System.out.println(a);
////        System.out.println(b);
////        System.out.println(a1);
////        System.out.println(b1);
//        if(a>b){
//            System.out.println('>');
//        }
//        else if(a<b){
//            System.out.println('<');
//        }
//        else{
//            System.out.println('=');
//        }
//
//    }
//
//    static void vanyaAndFence(long arr[], long h){
//        long n = arr.length;
//        long sum = 0;
//        for(int i=0; i<n;i++) {
//            if (arr[i] > h) {
//                if (arr[i] % h == 0) {
//                    long temp = arr[i] / h;
//                    sum += temp;
//                } else {
//                    long temp = (arr[i] / h)+1;
//                    sum += temp;
//                }
//            } else {
//                sum += 1;
//            }
//        }
//        System.out.println(sum);
//
//        }
//        static void antonAndDa(String s) {
//            int a = 0;
//            int d = 0;
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == 'A') {
//                    a++;
//                } else {
//                    d++;
//                }
//            }
////            System.out.println(a);
////            System.out.println(d);
//            if (a > d) {
//                System.out.println("Anton");
//            } else if (a < d) {
//                System.out.println("Danik");
//            } else {
//                System.out.println("Friendship");
//            }
//        }
//        static void bearAndBig(int a, int b){
//        int count = 0;
//            while(a<=b){
//                a *=3;
//                b *=2;
//                count++;
//            }
//            System.out.println(count);

//    static void matrix(int [][]matrix){
//        int count = 0;
//        int count1 = 0;
//        int indexi = -1;
//        int indexj = -1;
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                if(matrix[i][j]==1){
//                    indexi = i;
//                    indexj = j;
//                }
//            }
//        }
//        while(indexi!=2 || indexj!=2){
//            if(indexi>2){
//                indexi--;
//                count++;
//            }
//            else if(indexi<2){
//                indexi++;
//                count++;
//            }
//            if(indexj>2){
//                indexj--;
//                count1++;
//            }
//            else if(indexj<2){
//                indexj++;
//                count1++;
//            }
//        }
//        System.out.println(count+count1);
//        System.out.println(indexi+" "+indexj);


//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<5; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

//    }

    static void physicsCube(long arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void newYear(long n) {
//        long temp = n;
//        int count = -1;
//        while(temp>0){
//            temp/=10;
//            count++;
//        }
////        System.out.println(count);
//        long rem = (long) Math.pow(10,count);
//        long last = n%10;
//        long ans = n/rem;
////        System.out.println(ans);
//        if(n<4041){
//            System.out.println("No");
//        }
//        else if(last==0 || last==1){
//            System.out.println("No");
//        }
//
//        else if(last>=ans){
//            System.out.println("No");
//        }
//        else{
//            System.out.println("Yes");
//        }

        ///second approach

//        if(n%2020==2021 || n%2021==2020){
//            System.out.println("Yes");
//            System.out.println(n%2020);
//        }
//        else{
//            System.out.println("no");
//        }

        long z = 0, x = 0;
        while (true) {
            z = n - x * 2021;
            if (z % 2020 == 0 && z >= 0) {
                System.out.println("yes");
                break;
            }
            if (z < 0) {
                System.out.println("No");
                break;
            }
            x++;
        }
    }

    static void customizing(long[] arr) {
        long sum = 0;
        long n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long b = sum % n;
        long ans = b * (n - b);
        System.out.println(ans);
    }

    static void pizzaForces(long n) {
        long ans = 0;
//        if(n==1){
//            ans = 15;
//        }
//        else if(n<=6){
//            ans = 15;
//        }
//        else if(n<=8 && n>6){
//            ans = 20;
//        }
////        else if(n<=10 || n>8){
////            ans = 25;
////        }
//        else if(n%6==0){
//            ans =  (n/6)*15;
//        }
//        else if(n%8==0){
//            ans = (n/8)*20;
//        }
//        else if(n%10==0){
//            ans = (n/10)*25;
//        }
//        else if(n%10==1){
//            if((n+1)%6==0){
//                ans = ((n/6)*15)+15;
//            }
//            else if((n+1)%8==0){
//                ans = ((n/8)*20)+20;
//            }
//            else{
//                ans = ((n/8)*20)+15;
//            }
//
//        }
//        else if(n%10==7){
//            ans = ((n/10)*25)+20;
//        }
//        else if(n%10==2){
//            if((n+6)%6==0){
//                ans = ((n/6)*15)+15;
//            }
//            else{
//                ans = ((n/8)*20)+15;
//            }
//        }
//        else if(n%10==3){
//            if(n<15){
//                ans = ((n/8)*20)+15;
//            }
//            else {
//                if ((n + 1) % 6 == 0) {
//                    ans = ((n / 6) * 15)+15;
//                } else if ((n + 1) % 8 == 0) {
//                    ans = (n / 8) * 20;
//                } else {
//                    ans = ((n / 6) * 15) + 15;
//                }
//            }
//        }
//        else if(n%10==4){
//            if(n<20){
//                ans = ((n/8)*20)+15;
//            }
//            else{
//                ans = ((n/10)*25)+15;
//            }
//        }
//        else if(n%10==5){
//            ans = ((n/10)*25)+15;
//        }
//        else if(n%10==9){
//            ans = ((n+1)/10)*25;
//        }
//        else if(n%10==8){
//            ans=  ((n/10)*25)+20;
//        }
//        else if(n%10==6){
//            ans = ((n/10)*25)+15;
//        }
//        System.out.println(ans);

        if (n <= 6) {
            ans = 15;
        } else if (n % 2 == 0) {
            ans = (n * 2) + (n / 2);
        } else {
            long temp = n + 1;
            ans = (temp * 2) + (temp / 2);
        }
        System.out.println(ans);
    }

    static void findAp(long a, long b, long c) {
        long b1 = 2 * b;
        if ((a + c) % b1 == 0) {
            System.out.println("Yes");
            return;
        }
        if ((a + c) > b1) {
            System.out.println("No");
            return;
        }
        if ((b1 - c) % a == 0) {
            System.out.println("yes");
            return;
        }
        if ((b1 - a) % c == 0) {
            System.out.println("yes");
            return;
        }
        System.out.println("no");

    }

    static void musicalPuzzle(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuffer st = new StringBuffer();

        for (int i = 0; i < s.length() - 1; i++) {
            String temp = "";
            temp += s.charAt(i);
            temp += s.charAt(i + 1);
            sb.insert(0, temp + " ");
//            System.out.println(temp);
        }
        System.out.println(sb);
        System.out.println(sb.length());

    }

//    static void reverseOrder(long []arr, long []arr1, long k){
//        Arrays.sort(arr);
//        Arrays.sort(arr1);
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr1.length;j++){
//                if(arr1[j]-arr[i]<=k){
//                    arr[i]+=arr1[j]-arr[i];
//                }
//            }
//        }
//
//    }

    static void ValidBuilding(long arr[]) {
        Arrays.sort(arr);
        if (arr[0] % 2 == 1) {
            System.out.println("Yes");
            return;
        }
        for (long i = 0; i < arr.length; i++) {
            if (arr[(int) i] % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("yes");
    }

    static long maximumSum(long arr[], long k) {
        Arrays.sort(arr);
        long n = arr.length - 1;
        long sum = 0;
        long sum1 = 0;
        long sum2 = 0;
        long left = 0;
        long right = n - 1;
        while (true) {
            for (int i = 0; i <= 2 * k; i++) {
                sum1 += arr[i];
            }
            for (int i = (int) (n - k); i <= n; i++) {
                sum2 += arr[i];
            }
            if (sum1 <= sum2) {
                left = 2 * k;
            } else {
                right = n - k;
            }
            break;
        }


        for (int i = (int) left; i <= right; i++) {
            sum += arr[i];
        }
//        System.out.println(sum);
        return sum;
//        return sum;
    }

    static long maxiSumS(long arr[], long k) {
        Arrays.sort(arr);
        long n1 = arr.length;
        long sum3 = 0;
        long left1 = 0;
        long right1 = n1 - 1;
        while (k > 0) {
            if (arr[(int) left1] + arr[(int) (left1 + 1)] < arr[(int) right1]) {
                left1 += 2;
            } else {
                right1--;
            }
            k--;
        }
        for (int i = (int) left1; i <= right1; i++) {
            sum3 += arr[i];
        }
//        System.out.println(sum3);
        return sum3;
    }


    static void mainMaxiSum(long arr[], long k) {
        long sum = 0;
        long ans = 0;
        long ans1 = 0;
        long sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum % k == 0) {
                ans = sum / k;
            } else {
                ans = ((sum / k) + 1);
            }
            if (arr[i] % k == 0) {
                sum1 += arr[i] / k;
            } else {
                sum1 += ((arr[i] / k) + 1);
            }

        }
        System.out.println(ans + " " + sum1);

    }

    static void wizard(long k) {
        if (k == 1) {
            System.out.println(9);
        } else if (k == 2) {
            System.out.println(98);
        } else {
            k -= 3;
            long let = 0;
            System.out.print(989);
            for (int i = 0; i < k; i++) {
                System.out.print(let);
                let++;
                if (let == 10) {
                    let = 0;
                }

            }
            System.out.println();
        }

    }

    static void oddGrasshopper(long x, long n) {
//        for(long i=1; i<=n; i++){
//            if(x%2==0){
//                x = x-i;
//            }
//            else{
//                x = x+i;
//            }
//        }
//        System.out.println(x);
        if (n % 4 == 0) {
            System.out.println(x);
            return;
        } else if (n % 4 == 1) {
            if (x % 2 != 0) {
                System.out.println(x + n);
            } else {
                System.out.println(x - n);
            }
            return;
        } else if (n % 4 == 2) {
            if (x % 2 == 0) {
                System.out.println(x + 1);
            } else {
                System.out.println(x - 1);
            }
        } else if (n % 4 == 3) {
            if (x % 2 == 0) {
                System.out.println(x + n + 1);
            } else {
                System.out.println(x - (n + 1));
            }
        }

    }

    static void uniqueNumber(int n) {
        if (n > 45) {
            System.out.println(-1);
            return;

        }
        String s = "";
        for (int i = 9; i >= 1; i--) {
            if (n <= 9 && n <= i) {
                s += n;
                n = 0;
                break;
            } else {
                n -= i;
                s += i;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());


    }

    static void shiftingStack(long arr[]) {

        long n = arr.length;
        long sum = 0, need = 0;
        for (int i = 0; i < n; ++i) {
            need += i;
            sum += arr[i];
            if (sum < need) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("yes");

    }

    static void solves(long arr[], long k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k != (i + 1) % k) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else if (count == 2) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }


    static void divisibleBy3(long n) {
        long count = 0;
        long i = 1;
        long ans = 0;
        while (count < n) {
            if (i % 3 != 0 && i % 10 != 3) {
                ans = i;
                count++;
            }
            i = i + 1;
        }
        System.out.println(ans);
    }

    static void gcdPartition(long arr[]) {
        long n = arr.length;
        long[] prefix = new long[(int) n];
        long suffix[] = new long[(int) n];
        for (int i = 1; i < n; i++) {
            prefix[0] = arr[0];
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = (int) n - 2; i >= 0; i--) {
            suffix[(int) (n - 1)] = arr[(int) (n - 1)];
            suffix[i] = suffix[i + 1] + arr[i];
        }
//        for(int i=0; i<n; i++){
//            System.out.print(prefix[i]+" ");
//            System.out.println();
//            System.out.println();
//            System.out.print(suffix[i]+" ");
//        }

        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, iGCD(prefix[i], suffix[i + 1]));
        }
        System.out.println(ans);
    }

    static void divisibleBy7(long n) {
        long ans = -1;
        if (n % 7 == 0) {
            System.out.println(n);
            return;
        }
//        else{
//            n = n - n%10;
//            n+=7-n%7;
//            System.out.println(n);
//        }

        else {
            for (int i = 1; i < 10; i++) {
                if (((n - (n % 10)) + i) % 7 == 0) {
                    ans = ((n) - n % 10) + i;
                    break;
                }
            }
            System.out.println(ans);
        }

    }

    static void oddEven(ArrayList<Long> arr) {
        int n = arr.size();
        Collections.sort(arr, Collections.reverseOrder());
        long alice = 0;
        long Bob = 0;
        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i)+" ");
            if (i % 2 == 0) {
                if (arr.get(i) % 2 == 0) {
                    alice += arr.get(i);
                }
            } else {
                if (arr.get(i) % 2 != 0) {
                    alice -= arr.get(i);
                }
            }
        }
        if (alice > 0) {
            System.out.println("Alice");
        } else if (alice == 0) {
            System.out.println("Tie");
        } else {
            System.out.println("Bob");
        }


    }

    static void oddEven1(long arr[]) {
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 == 0) {
                    ans += arr[i];
                }
//                else{
//                    ans -= arr[i];
//
//                }
            } else {
                if (arr[i] % 2 == 1) {
                    ans -= arr[i];
                }
//                else{
//                    ans += arr[i];
//                }
            }
        }
        System.out.println(ans);
    }

    static boolean arraySort(long arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static void permutationSort(long arr[]) {
//        int count = 0;
        long n = arr.length;
//        for(int i=0; i<n-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                count++;
//            }
//        }
//        System.out.println(count);
        if (arraySort(arr) == true) {
            System.out.println(0);
            return;
        }
        if (arr[0] == 1 || arr[(int) n - 1] == n) {
            System.out.println(1);
        } else if (arr[0] == n && arr[(int) n - 1] == 1) {
            System.out.println(3);
        } else {
            System.out.println(2);
        }
    }

    static void makeDivisibility25(String s) {
        int n = s.length();
        int index = n;
        int index2 = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int num = ((s.charAt(i) - '0') * 10 + s.charAt(j) - '0');
//                System.out.println(num);
                if (num % 25 == 0) {
                    index = Math.min(index, (j - i - 1) + (n - 1 - j));
                }
            }
        }
        System.out.println(index);
//        System.out.println(index2);
    }

    static int election(int a, int b, int c) {
//        long ans = 0;
//        if(a==0 && b==0 && c==0){
//            a+=1;
//            b+=1;
//            c+=1;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(a==b&& b==c){
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(a>b && a>c){
//            c = (a-c)+1;
//            b = (a-b)+1;
//            a = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(b>c && b>a){
//            c = (b-c)+1;
//            a = (b-a)+1;
//            b = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(c>a && c>b){
//            a = (c-a)+1;
//            b = (c-b)+1;
//            c = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(a==b && c<b){
//            a += 1;
//            c = (b-c)+1;
//            b = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(a==c && b<c){
//            a+=1;
//            b = (c-b)+1;
//            c = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(b==c && a<c){
//            b+=1;
//            a = (c-a)+1;
//            c = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(a==b && b>c){
//            a += 1;
//            c = (b-c)+1;
//            b = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(a==c && b>c){
//            a = (b-a)+1;
//            c = (b-c)+1;
//            b = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }
//        else if(b==c && a>b){
//            b = (a-b)+1;
//            c = (a-c)+1;
//            a = 0;
//            System.out.println(a+" "+b+" "+c);
//            return;
//        }

        return Math.max(0, Math.max(b, c) + 1 - a);

    }

    static void strings(double aco, String costumer_name, String debitCard) {
        double balance = 1000;
        double b = aco - 14;
        double balance1 = 1000 + (b * 10);
        System.out.println((int) aco + "," + balance1 + "," + costumer_name + "," + debitCard);

    }

    static void boringApartment(int n) {
        int count = 0;
        int r = n;
        while (n > 0) {
            n /= 10;
            count++;
        }
        int ans = (count * (count + 1)) / 2;
//        System.out.println(ans+((r-1)*10));
        int l = (r % 10) - 1;
        int s = l * 10;
//        System.out.println(count);
        System.out.println(ans + s);
//        System.out.println(s);
    }

    static void itBookSelf(long[] arr) {
        long l = 0;
        long r = 0;
        long n = arr.length;
        long ans = 0;
        long fans = 0;
        while (r <= n) {
            if (l == 1 && r == 1) {
                ans = r - l;
                fans += ans;
                l = r;
                r++;
            } else if (l == 1 && r == 0) {
                r++;
            } else if (l == 0 && r == 0) {
                l++;
                r++;
            }
        }
        System.out.println(fans);

    }

    static void dominant(long arr[]) {
        int index = -1;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = (int) Math.max(arr[i], max);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) continue;
            if (i > 0 && arr[i - 1] != max) index = i + 1;
            if (i < arr.length - 1 && arr[i + 1] != max) index = i + 1;

        }
        System.out.println(index);
    }

    static void divideMultiply2(long arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] % 2 == 0) {
                count++;
                arr[i] /= 2;
            }
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = (int) Math.max(max, arr[i]);

        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        sum -= max;
        long power = (long) Math.pow(2, count);

//        System.out.println(sum);
//        System.out.println(max);
//        System.out.println(count);
        System.out.println(sum + (max * power));
    }

    static void balancereminder(long arr[]) {
        long n = arr.length;
        long rem = n / 3;
        long c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                c0++;
            } else if (arr[i] % 3 == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        c0 -= n / 3;
        c1 -= n / 3;
        c2 -= n / 3;
        long moves = 0;
        while (c0 != 0 || c1 != 0 || c2 != 0) {
            if (c0 > 0) {
                moves += c0;
                c1 += c0;
                c0 = 0;
            } else if (c1 > 0) {
                moves += c1;
                c2 += c1;
                c1 = 0;
            } else if (c2 > 0) {
                moves += c2;
                c0 += c2;
                c2 = 0;
            }
        }
        System.out.println(moves);

    }

    //    static void luntik(long arr[]){
//        long one = 0;
//        long zero = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==1){
//                one++;
//            }
//            else if(arr[i]==0){
//                zero++;
//            }
//        }
//        long ans = (long) (one*(Math.pow(2,zero)));
//        System.out.println((long)ans);
//
//    }
//    static void mochaAndMath(String s){
//        long andi = arr[0];
//        for(int i=0; i<arr.length; i++){
//            andi = andi & arr[i];
//        }
//        System.out.println(andi);
//    }
    static void mochaPuzzle(String s) {
        if (s.length() % 2 == 0 && s.charAt(0) != ')' && s.charAt(s.length() - 1) != '(') {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    static void increasingOrder(long arr[]) {
        int count = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (arr[i] >= arr[i + 1] && arr[i] > 0) {
                arr[i] /= 2;
                count++;
                System.out.println(arr[i]);
            }
            if (arr[i] == arr[i + 1]) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(count);
    }

    static void badBoy(long m, long n, long i1, long j) {
        System.out.println(1 + " " + 1 + " " + m + " " + n);
    }

    static void challengingCliffs(long arr[]) {

        long n = arr.length;
        Arrays.sort(arr);
        if (n == 2) {
            System.out.println(arr[0] + " " + arr[1]);
            return;
        }
        int idx1 = -1;
//        long idx2 = 0;
        long min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (min > Math.abs(arr[i] - arr[i - 1])) {
                idx1 = i;
                min = Math.abs(arr[i] - arr[i - 1]);
//               System.out.println(min);
//               System.out.println(idx1);
            }
        }
        for (int i = idx1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < idx1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//        System.out.println(min);
    }


    static void redBlue(long arr[][], long s) {
        long p = s;
        int n = arr.length;
        boolean f = true;
        if (n == 1) {
            System.out.println("yes");
            return;
        }
//        long arr1[][] = new long[n][n];
//        long n1 = arr1.length;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                arr1[i][j] = arr[n-1-i][n-1-j];
//            }
//        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[n - 1 - i][n - 1 - j]) {
                    if (s == 0) {
                        f = false;
                        break;
                    }
                    arr[i][j] = arr[n - 1 - i][n - 1 - j];
                    s--;
                }
            }
            if (f == false)
                break;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[n - 1 - i][n - 1 - j]) {
                    count++;
                }
            }
        }
        if (count != 0) {
            System.out.println("No");
        } else {
            if (s % 2 == 0) {
                System.out.println("yes");
            } else {
                if (n % 2 != 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("No");
                }
            }
        }

//        long ans = s-count;
//        if(count>s){
//            System.out.println("No");
//            return;
//        }
//        else if(count==s){
//            System.out.println("yes");
//            return;
//        }
//        else if(count<s){
//            if(ans%2==0){
//                System.out.println("yes");
//                System.out.println(ans);
//            }
//           else{
//               if(n%2==1){
//                   System.out.println("yes");
//               }
//               else{
//                   System.out.println("No");
//               }
//            }
//            System.out.println(count);
//        }
//
//        for(int i=0; i<n1; i++){
//            for(int j=0; j<n1; j++){
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

    static void swapArr(long arr[], long arr1[]) {
//        long ans = Integer.MAX_VALUE;
//        long idx1 = -1;
//        long idx = -1;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++) {
//                if (arr1[j] - arr[i] > 0) {
//                    idx = i;
//                    idx1 = j;
//                    ans = Math.min((i+j),ans);
//                }
//            }
//        }
//        System.out.println(ans);
        long pos = Integer.MAX_VALUE;
        long ans = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 != 0) {
                pos = Math.min(pos, arr[i]);
            } else {
                ans = Math.min(ans, pos + arr1[i]);
            }
        }
        System.out.println(ans);

    }

    static void severalAndMocha(long arr[]) {
//        int n = arr.length;
//        boolean ans = true;
//        for(int i=0; i<n-1 && ans; i++){
//            for(int j = i+1; j<n; j++){
//                if(iGCD(arr[i],arr[j])==1 || iGCD(arr[i],arr[j])==2){
//                    ans = false;
//                    break;
//                }
//            }
//
//        }
//        if(ans) System.out.println("No");
//        else System.out.println("yes");
//        boolean flag = true;
        int n = arr.length;
        for (int i = 0; i < 101; i++) {
            if (arr[i] == 0) break;
            if (arr[i] >= arr[i + 1]) {
                n -= arr[i];
            } else {
                break;
            }
        }
        if (n == 0) System.out.println("Yes");
        else System.out.println("No");
    }

    static void astrophysicists(long n, long k, long g) {
        long tat = k * g;
        long t = (g - 1) / 2;
        long d = (n - 1) * t;
        if (k * g <= d) {
            long ans = k * g;
            System.out.println(ans);
            return;
        }
        long rem = k * g - d;
        long r = rem % g;
        if (r <= t) {
            long ans = d + r;
            System.out.println(ans);
        } else {
            long ans = d - (g - r);
            if (ans < 0) ans = 0;
            System.out.println(ans);
        }
    }

    static void inversionString(String s) {
        int n = s.length();
        long arr[] = new long[(int) n];
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] == 0) {
                i++;
            } else {
                count++;
                while (arr[i] == 1 && i < n / 2) {
                    i++;
                }
            }
        }
        if (count < 2) System.out.println("yes");
        else System.out.println("No");
    }

    static void solve(String s) {
        long z = -1;
        boolean flag = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                if (z == -1) {
                    z = i;
                } else if (z + 1 != i) {
                    flag = false;
                    break;
                } else {
                    z = i;
                }
            }
        }
        if (flag) System.out.println("yes");
        else System.out.println("No");

    }

    static void longLong(long arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; ) {
            if (arr[i] >= 0) {
                i++;
            } else {
                count++;
                if (i < n) {
                    while (arr[i] <= 0) {
                        i++;
                        if (i >= n) {
                            break;
                        }
                    }
                }
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
//            arr[i] = Math.abs(arr[i]);
            sum = sum + Math.abs(arr[i]);
        }
        System.out.println(sum + " " + count);

    }

    static void sumInBinaryTree(long n) {
        long ans = 0;
        long rem = 0;
        while (n >= 1) {
            ans += n;
            n = n / 2;
        }
        System.out.println(n + ans);

    }

    static void trackingSegment(long n, long m, long q) {

    }

    //    static void sashaColoring(long arr[]){
//        Arrays.sort(arr);
//        int n = arr.length;
//        int l = 0;
//        int r = n-1;
//        int ans = 0;
//        while(l<=r){
//            long g = arr[r]-arr[l];
//            ans += g;
//            l++;
//            r--;
////            System.out.println(l+" "+r);
////            System.out.println(g);
//        }
//        System.out.println(ans);
//    }
    static void arrayReodering(ArrayList<Long> arr) {
//         Collections.reverse(arr);
        ArrayList<Long> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr1.add(arr.get(i));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 1) {
                arr1.add(arr.get(i));
            }
        }
        long ans = 0;
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (iGCD(arr1.get(i), arr1.get(j) * 2) > 1) {
                    ans++;
                }
            }
        }
//        for(int i=0; i<arr.size(); i++){
//            System.out.print(arr1.get(i)+" ");
//        }
//        System.out.println();
        System.out.println(ans);
    }

    static void candies(long n) {
        long x = 1;
        long s;
        for (int i = 2; i <= 35; i++) {
            s = (long) (Math.pow(2, i) - 1);
//             System.out.println(s);
            if (n % s == 0) {
                System.out.println(n / s);
                break;
            }
        }
    }

    static void fromTheLeft(String s, String s1) {
        int n = s.length();
        int n1 = s1.length();
        int index1 = 0;
        int index2 = -1;
        int i = n - 1;
        int i1 = n1 - 1;
        while (i >= 0 && i1 >= 0) {
            if (s.charAt(i) == s1.charAt(i1)) {
                i--;
                i1--;
                index1++;
            } else {
                break;
            }
        }
        System.out.println((n + n1) - index1 * 2);

    }

    static void contest(int a, int b, int c, int d) {
        int a1 = 3 * a / 10;
        int a2 = a / 250;
        int a3 = a2 * c;
        int b1 = 3 * b / 10;
        int b2 = b / 250;
        int b3 = b2 * d;
        int misha = Math.max(a1, (a - a3));
        int vas = Math.max(b1, (b - b3));
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(misha);
//        System.out.println(vas);
        if (misha > vas) {
            System.out.println("Misha");
        } else if (vas > misha) {
            System.out.println("Vasya");
        } else {
            System.out.println("Tie");
        }
    }

    static void decoding(String s) {
        String s1 = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if ((n - i - 1) % 2 == 0) {
                s1 = s.charAt(i) + s1;
            } else {
                s1 = s1 + s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        System.out.println(sb);
    }

    static void evenOdd(long n, long k) {
//         if(k*2<=n){
//             System.out.println(k*2-1);
//         }
        long odd = 0;
        long even = 0;
        long ans = 0;

        if (n % 2 == 1) {
            odd = n / 2 + 1;
            even = n / 2;
            if (odd < k) {
                ans = k - odd;
                System.out.println(ans * 2);
            } else {
                System.out.println(k * 2 - 1);
            }
        } else {
            odd = n / 2;
            even = n / 2;
            if (odd < k) {
                ans = k - odd;
                System.out.println(ans * 2);
            } else {
                System.out.println(k * 2 - 1);
            }

        }

    }

    static void perfectPair(long x, long y, long m) {
        if (x >= m || y >= m) {
            System.out.println(0);
            return;
        }
        if (x < 1 && y < 1) {
            System.out.println(-1);
            return;
        }
//         if((x+y)<1){
//             System.out.println(-1);
//             return;
//         }
        int count = 0;
        long n = 0;
        while (Math.max(x, y) < m) {
            if (x == y) {
                x += y;
                count++;
                continue;
            }
            if (x < y) {
                long ch = y - x;
                long jit = (ch / y) + ch % y;
                x += jit * y;
                count += jit;

            } else {
                long ch = x - y;
                long jit = ch / x + (ch % x);
                y += jit * x;
                count += jit;

            }
        }
        System.out.println(count);
    }

    static void plusMultiply(long n, long a, long b) {
        long x = 1;
        if (b == 1) {
            System.out.println("Yes");
            return;
        } else if (a == 1) {
            if (n % b == x % b) {
                System.out.println("yes");
            } else {
                System.out.println("No");
            }
        }
        while (x <= n) {
            if (x % b == n % b) {
                System.out.println("yes");
                break;
            }
            a *= x;
        }
        System.out.println("No");
    }

    static void quickSorte(long arr[], long k) {
        long n = arr.length;
//         long ans = n+1;
//         long sm = n+1;
//         for(int i = (int) n; i>=1; i--){
//             if(arr[i]>sm){
//                 ans = Math.min(ans,arr[i]);
////                 System.out.println(ans);
//             }
//             sm = Math.min(sm,arr[i]);
////             System.out.println(ans);
//         }
//        System.out.println(ans);
//         ans = (n-ans)+1;
//        System.out.println(ans);
//         if(ans%k==0){
//             System.out.println(ans/k);
//         }
//         else{
//             System.out.println((ans/k)+1);
//         }
        long ans = n + 1;
        long sm = n + 1;
        for (int i = (int) n - 1; i >= 0; i--) {
            if (arr[i] > sm) {
                ans = Math.min(ans, arr[i]);
            }
            sm = Math.min(sm, arr[i]);
        }
        ans = (n - ans) + 1;
//        System.out.println(ans);
        if (ans % k == 0) {
            System.out.println(ans / k);
        } else {
            System.out.println((ans / k) + 1);
        }
    }

    static void greatestConvex(long n) {

        System.out.println(n - 1);

    }

    static void alicBob(long n) {
        long alice = 0;
        long bob = 0;
        long curr = 1;
        boolean flag = true;
        while (n > 0) {
            if (flag) {
                if (n >= curr) {
                    n -= curr;
                    alice += curr;
                    curr++;
                    if (n >= curr) {
                        n -= curr;
                        bob += curr;
                        curr++;
                    } else {
                        bob += n;
                        n = 0;
                    }
                } else {
                    alice += n;
                    n = 0;
                }
                flag = false;
            } else {
                if (n >= curr) {
                    n -= curr;
                    bob += curr;
                    curr++;
                    if (n >= curr) {
                        n -= curr;
                        alice += curr;
                        curr++;
                    } else {
                        alice += n;
                        n = 0;
                    }
                } else {
                    bob += n;
                    n = 0;
                }
                flag = true;
            }
        }
        System.out.println(alice + " " + bob);
    }

    static void oneTwo(long arr[]) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
        }
        long ans = 0;
        if (count % 2 == 0) {
            ans = count / 2;
            long co = 0;
            long ans1 = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2) {
                    co++;
                }
                if (co == ans) {
                    System.out.println(i + 1);
                    return;
                }
            }
        } else {
            System.out.println(-1);
        }
    }

    static void solve1(long n) {
        if (n % 2 == 0) {
            System.out.println(n / 2 + " " + n / 2);
        } else {
            if ((n + 1) % 200 == 0) {
                n = n - 17;
                System.out.println(((n / 2) + 17) + " " + (n / 2));
                System.out.println(n / 2);
            } else if ((n + 1) % 20 == 0 && (n + 1) % 200 != 0) {
                n = n - 19;
                System.out.println(((n / 2) + 15) + " " + ((n / 2) + 4));
            } else {
                System.out.println(((n / 2) + 1) + " " + (n / 2));
            }
        }
    }

    static void solve3(long n, long k) {
        if (n >= k) {
            if (n % k == 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else if (n < k) {
            if (k % n == 0) {
                System.out.println(k / n);
            } else {
                System.out.println((k / n) + 1);
            }
        }
    }

    static void phoenixAndPuzzle(long n) {
        while (n % 2 == 0) {
            if (n == 2) {
                break;
            }
            n /= 2;
        }
        if (n == 2) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    static void solveContest(long n, long k, long x) {
        if (x != 1) {
            System.out.println("yes");
            System.out.println(n);
            for (int i = 1; i <= n; i++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        } else if (n == 1 || k == 1) {
            System.out.println("No");
        } else if (n % 2 == 0) {
            System.out.println("Yes");
            System.out.println(n / 2);
            for (int i = 1; i <= n / 2; i++) {
                System.out.print(2 + " ");
            }
            System.out.println();
        } else if (k > 2) {
            System.out.println("yes");
            System.out.println((n - 3) / 2 + 1);
            for (int i = 1; i <= (n - 3) / 2; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(3);
        } else {
            System.out.println("No");
        }
    }

    static void like(long arr[]) {
        int like = 0;
        int dislike = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                like++;
            } else {
                dislike++;
            }
        }
        for (int i = 1; i <= like; i++) {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= dislike; i++) {
            System.out.print((like - i) + " ");
        }
        System.out.println();
        for (int i = 1; i <= 2 * dislike; i++) {
            if (i % 2 == 0) {
                System.out.print(0 + " ");
            } else {
                System.out.print(1 + " ");
            }
        }
        for (int i = 1; i <= like - dislike; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void sameDifference(long arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j < arr.length) {
                if (i < j) {
                    if (arr[j] - arr[i] == j - i) {
                        count++;
                        j++;
                    } else {
                        j++;
                    }
                } else {
                    j++;
                }
            }
        }
        System.out.println(count);
//        for(int i=0; i<arr.length; i++){
//            for(int j=i; j<arr.length; j++){
//                if(j>i){
//                    if(arr[j]-arr[i]==j-i){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
    }

    static void permutationMinimize(long arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void kevinPermutation(long n) {
        long x = 0;
        if (n % 2 == 0) {
            x = n / 2;
            while (x != 0) {
                System.out.print(x-- + " " + n-- + " ");
            }
            System.out.println();
        } else {
            x = n / 2 + 1;
            while (x != 1) {
                System.out.print(x-- + " " + n-- + " ");
            }
            System.out.println(1);
            System.out.println();
        }
    }

    static void ugu(String s) {
        int zero = 0;
        boolean found = false;
        boolean ra = false;
        for (int i = 0; i < s.length(); i++) {
            if (!found && s.charAt(i) == '1') {
//                 zero++;
                found = true;
            } else if (found && ((s.charAt(i) == '0' && !ra) || (s.charAt(i) == '1') && ra)) {
                zero++;
                ra = !ra;

            }
        }
        System.out.println(zero);

    }

    static void permutationSwap(long arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = arr[i] + 1;
                count++;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] % arr[i] == 0 && count < (2 * arr.length)) {
                count++;
                arr[i + 1] = arr[i + 1] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;

    }

    static void palindromeCheck(String s) {
        int ans = 1;
        if (s.charAt(0) == '?') {
            ans *= 9;
        } else if (s.charAt(0) == '0') {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                ans *= 10;
            }
        }
        System.out.println(ans);
    }

    static void comeTogether(long xa, long ya, long xb, long yb, long xc, long yc) {
        long ans = 1;
        if (xa > xb && xa > xc) {
            ans += xa - Math.max(xb, xc);
        }
        if (xa < xb && xa < xc) {
            ans += Math.min(xb, xc) - xa;
        }
        if (ya > yb && ya > yc) {
            ans += ya - Math.max(yb, yc);
        }
        if (ya < yb && ya < yc) {
            ans += Math.min(yb, yc) - ya;
        }
        System.out.println(ans);
    }

    static void nastiaRice(int n, int a, int b, int c, int d) {
        int r = n * (a - b);
        int l = n * (a + b);
        if (r > c + d || l < c - d) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    static int factorization(long n) {
        int ans = 0;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                return i;
            }
        }
        if (n != 1) {
            System.out.println(n);
            ans = (int) n;
        }
        return ans;
    }

    static void oracAndFactor(long n, long k) {
        long ans = 0;
        if (n % 2 == 0) {
            System.out.println(n + 2 * k);
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    ans = i;
                    break;
                }
            }
            System.out.println((n + ans) + 2 * (k - 1));
        }
    }

    static void limeKing(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        long max = 0;
        if (a == b) {
            System.out.println(a + b);
        } else {
            max = Math.max(a, b);
            System.out.println((max * 2) - 1);
        }
    }

    static void vaccitional(long n, long k, long d, long w, long arr[]) {
        long when = -1;
        long ans = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= when + d && count > 0) {
                count -= 1;
            } else {
                when = arr[i] + w;
                count = k - 1;
                ans += 1;
            }
        }
        System.out.println(ans);
    }

    static boolean primes(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        if (n <= 1) {
            return false;
        }
        return true;
    }

    static void inputsolve(long n) {

        if ((int) n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(2 + " " + 1);
        } else {
            long arr[] = new long[(int) n];
            arr[0] = 3;
            arr[(int) n - 1] = 2;
            arr[(int) n / 2] = 1;
            int value = 4;
            for (int i = 1; i < arr.length - 1; i++) {
                if (i == n / 2) {
                    continue;
                }
                arr[i] = value;
                value++;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    static void solve9(long arr[]) {
        int n = arr.length;
        long result = arr[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < 0 && arr[i + 1] > 0) {
                result += arr[i];
                arr[i + 1] += arr[i];
            }
        }
        System.out.println(result);
    }

    static void abcde(long a, long b) {
        System.out.println(a + b);
    }

    static void particles(long arr[]) {
        long odd = 0;
        long even = 0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                if(arr[i]>0){
                    even+=arr[i];
                }
            }
            else{
                if(arr[i]>0){
                    odd+=arr[i];
                }
            }
        }
        long max = 0;
        if(even==0 && odd==0) {
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                max = Math.max(arr[i], max);
            }
        }
        else{
            max = Math.max(even, odd);
            }
           System.out.println(max);
    }
    static void berlandMusic(long arr[], String s){
        ArrayList<Integer>arr1 = new ArrayList<Integer>();
        ArrayList<Integer>arr2 = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                arr1.add(i+1);
            }
        }
        for(int i=0; i<arr1.size(); i++){
            System.out.print(arr1.get(i)+" ");
        }
        System.out.println();
    }
    static void findLcm(String s, String t){
        int m = s.length();
        int n = t.length();
        long gcd = iGCD(m,n);
        int l = (int) ((n*m)/gcd);
        String ans = "";
        int k = 0;
        for(int i=0; i<l; i++){
            ans+=s.charAt(k);
            k++;
            k%=m;
        }
        k = 0;
        for(int i=0; i<l; i++){
            if(ans.charAt(i)!=t.charAt(k)){
                System.out.println(-1);
                return;
            }
            k++;
            k%=n;
        }
        System.out.println(ans);
    }
    static  void equation(long n){
        if(!primes((int) (n+4))){
            System.out.println((n+4)+" "+4);
        }
        else if(!primes((int) (n+6))){
            System.out.println((n+6)+" "+6);
        }
        else{
            System.out.println((n+8)+" "+8);
        }
    }
    static void sumevenodd(long n){
        if(n%2==0){
            System.out.println(n/2);
        }
        else{
            System.out.println(-(n+1)/2);
        }
    }
    static void XXXX(long arr[], long k){
        long sum = 0;
        long length1 = 0;
        long length2 = 0;
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        if(sum%k!=0){
            System.out.println(arr.length);
            return;
        }

        else{
            for(int i=0; i<arr.length; i++){
                if((sum-arr[i])%k!=0){
                    length1 = Math.max(length1,(arr.length-i-1));
                    flag = false;
                }
            }
            int n = arr.length;
            for(int i=0; i<arr.length; i++){
                if((sum-arr[n-i-1])%k!=0){
                    length2 = Math.max(length2,(arr.length-i-1));
                    flag = false;
                }
            }
        }
        if(!flag){
            System.out.println(Math.max(length1,length2));
        }
        else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t1 = sc.nextInt();
//        for (int i = 0; i < t1; i++) {
            long n = sc.nextLong();
//            for(int l=0; l<9; l++) {

//            char s = sc.next().charAt(0);
//            long k = sc.nextLong();
//            long d = sc.nextLong();
//            long w = sc.nextLong();
//            long arr[] = new long[(int) n];
//            for (int a = 0; a < n; a++) {
//                arr[a] = sc.nextLong();
//            }
//            String s = sc.next();
//            String t = sc.next();
//            long k = sc.nextLong();
//            ArrayList<Long>arr = new ArrayList<Long>((int) k+1);
//            for(long j=0; j<k; j++){
//                long  a = sc.nextLong();
//                arr.add(a);
//            }
//            berlandMusic(arr,s);
//            findLcm(s,t)
//            0;
//           sumevenodd(n);
//        XXXX(arr,k);
            equation(n);
        }
    }
//}
//
//}

