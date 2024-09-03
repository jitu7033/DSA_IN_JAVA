//public class LongestSpecialSubstring {
//
//    public static String findLongestSpecialSubstring(String input) {
//        int n = input.length();
//        int[] suffixArray = buildSuffixArray(input);
//        int[] lcpArray = buildLCPArray(input, suffixArray);
//
//        int low = 0, high = n - 1;
//        int result = 0;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (search(suffixArray, lcpArray, mid) >= mid) {
//                result = mid;
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//
//        if (result == 0) {
//            return "No special substring found.";
//        } else {
//            int startIndex = suffixArray[0];
//            return input.substring(startIndex, startIndex + result);
//        }
//    }
//
//    private static int search(int[] suffixArray, int[] lcpArray, int k) {
//        int n = suffixArray.length;
//        int count = 0;
//        int maxLength = 0;
//
//        for (int i = 1; i < n; i++) {
//            if (lcpArray[i] >= k) {
//                count++;
//            } else {
//                count = 0;
//            }
//
//            if (count >= 2) {
//                maxLength = Math.max(maxLength, lcpArray[i]);
//            }
//        }
//
//        return maxLength;
//    }
//
//    private static int[] buildSuffixArray(String input) {
//        int n = input.length();
//        int[] suffixArray = new int[n];
//        Suffix[] suffixes = new Suffix[n];
//
//        for (int i = 0; i < n; i++) {
//            suffixes[i] = new Suffix(i, input.charAt(i) - '$', i + 1 < n ? input.charAt(i + 1) - '$' : -1);
//        }
//
//        Arrays.sort(suffixes);
//
//        int[] index = new int[n];
//
//        for (int length = 4; length < 2 * n; length <<= 1) {
//            int rank = 0;
//            int prevRank = suffixes[0].rank[0];
//            suffixes[0].rank[0] = rank;
//            index[suffixes[0].index] = 0;
//
//            for (int i = 1; i < n; i++) {
//                if (suffixes[i].rank[0] == prevRank && suffixes[i].rank[1] == suffixes[i - 1].rank[1]) {
//                    prevRank = suffixes[i].rank[0];
//                    suffixes[i].rank[0] = rank;
//                } else {
//                    prevRank = suffixes[i].rank[0];
//                    suffixes[i].rank[0] = ++rank;
//                }
//                index[suffixes[i].index] = i;
//            }
//
//            for (int i = 0; i < n; i++) {
//                int nextIndex = suffixes[i].index + length / 2;
//                suffixes[i].rank[1] = (nextIndex < n) ? suffixes[index[nextIndex]].rank[0] : -1;
//            }
//
//            Arrays.sort(suffixes);
//        }
//
//        for (int i = 0; i < n; i++) {
//            suffixArray[i] = suffixes[i].index;
//        }
//
//        return suffixArray;
//    }
//
//    private static int[] buildLCPArray(String input, int[] suffixArray) {
//        int n = input.length();
//        int[] lcpArray = new int[n];
//        int[] rank = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            rank[suffixArray[i]] = i;
//        }
//
//        int k = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (rank[i] == n - 1) {
//                k = 0;
//                continue;
//            }
//
//            int j = suffixArray[rank[i] + 1];
//
//            while (i + k < n && j + k < n && input.charAt(i + k) == input.charAt(j + k)) {
//                k++;
//            }
//
//            lcpArray[rank[i]] = k;
//
//            if (k > 0) {
//                k--;
//            }
//        }
//
//        return lcpArray;
//    }
//
//    private static class Suffix implements Comparable<Suffix> {
//        int index;
//        int[] rank = new int[2];
//
//        Suffix(int index, int rank1, int rank2) {
//            this.index = index;
//            this.rank[0] = rank1;
//            this.rank[1] = rank2;
//        }
//
//        @Override
//        public int compareTo(Suffix other) {
//            if (this.rank[0] == other.rank[0]) {
//                return Integer.compare(this.rank[1], other.rank[1]);
//            } else {
//                return Integer.compare(this.rank[0], other.rank[0]);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String inputString = "banana";
//        String result = findLongestSpecialSubstring(inputString);
//        System.out.println("Longest Special Substring: " + result);
//    }
//}
