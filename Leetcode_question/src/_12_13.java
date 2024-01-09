public class _12_13 {
    public static void main(String[] args) {
        Solution1213 s = new Solution1213();
        String s1 = "egcfe";
        System.out.println(s.makeSmallestPalindrome(s1));

    }
}
class Solution1213 {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int m = s.length() - 1;
        int n = 0;
        char [] res = new char[m+1];
        while (n <= m){
            if(arr[n] <= arr[m]){
                res[n] = arr[n];
                res[m] = arr[n];

            } else{
                res[n] = arr[m];
                res[m] = arr[m];
            }
            n++;
            m--;
        }
        return new String(res);

    }
}