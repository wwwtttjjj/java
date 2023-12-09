public class _12_3 {
    public static void main(String[] args) {
        int[] cardPoints = new int[]{1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        Solution123 s = new Solution123();
        s.maxScore(cardPoints, 3);
    }
}
class Solution123 {
    public int maxScore(int[] cardPoints, int k) {
        int s = 0;
        int l = cardPoints.length - 1;
        for (int i = 0; i < k; i++) {
            s += cardPoints[i];
        }
        int m = s;
        for (int i = 0; i < k; i++) {
            s += cardPoints[l - i] - cardPoints[k - 1 - i];
            m = s > m? s:m;
        }
        return m;
    }
}
