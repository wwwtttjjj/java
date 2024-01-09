import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _12_28 {
    public static void main(String[] args) {
        Solution1228 s = new Solution1228();
        int x = 5;
        int [] num = new int []{1,2,3};
        s.minCost(num, 5);
    }
}
class Solution1228 {
    public long minCost(int[] nums, int x) {
        //直接枚举即可
        long s = 0;
        int n = nums.length;
        int [] f = new int [n];
        System.arraycopy(nums, 0, f, 0, n);//copy nums至f
        long ans = getSum(f);

        for(int k = 1;k<n;++k){
            for(int i=0;i<n;++i){
                f[i] = Math.min(f[i], nums[(i+k)%n]);
            }
            ans = Math.min(ans, (long) k * x + getSum(f));
        }

        return ans;

    }
    public long getSum(int [] f){
        long sum = 0;
        for(int s: f){
            sum += s;
        }
        return sum;
    }
}
