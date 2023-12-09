import java.util.ArrayList;
import java.util.Arrays;

public class _12_8 {
    public static void main(String[] args) {

    }
}
class Solution128 {
    public long maxTaxiEarnings(int n, int[][] rides) {
        //将rides 按照 end
        //  从小到大进行排序
        //感觉是dp
        Arrays.sort(rides, (a, b) -> a[1] - b[1]);//降序则是b[1]-a[1]
        int l = rides.length;
        long [] dp = new long [l + 1];//dp保存的状态是以end为终点所得到的最大花费
        for (int i = 0; i < l; i++){
            int j = binarySearch(rides, i, rides[i][0]);
            dp[i+1] = Math.max(dp[i], dp[j] + rides[i][1] - rides[i][0] + rides[i][2]);
        }
        return dp[l];
    }
    public int binarySearch(int [][]rides, int i, int j){
        int low = 0;
        //二分
        while(low < i){
            int mid = low + (i - low) / 2;
            if (rides[mid][1] > j){
                i = mid;
            }
            else{
                low = mid + 1;
            }

        }
        return low;
    }
}
