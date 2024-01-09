import java.util.Arrays;
import java.util.stream.IntStream;

public class _12_29 {
    public static void main(String[] args) {
        Solution1229 s = new Solution1229();
        int [] c = new int [] {4,3,2,3};
        System.out.println(s.buyChoco(c, 3));
    }
}
class Solution1229 {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return money - (prices[0] + prices[1]) >= 0?money - (prices[0] + prices[1]):money;
    }
}
