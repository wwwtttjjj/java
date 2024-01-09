public class _12_14 {
    public static void main(String[] args) {

    }
}
class Solution1214 {
    public boolean possibleToStamp(int[][] grid, int stampHeight, int stampWidth) {
        //太难了没思路
        //二位差分加二维前缀和
        int m = grid.length;
        int n = grid[0].length;
        int [][] sum = new int[m + 2][n + 2];
        int [][] diff = new int[m + 2][n + 2];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1]-sum[i-1][j-1]+grid[i-1][j-1];//这块是求前缀和的
            }
        }
        for (int i = 1; i+stampHeight - 1 <= m;i++){
            for(int j = 1; j+stampWidth - 1<=n;j++){
                int x = i + stampHeight - 1;
                int y = j + stampWidth - 1;
                if (sum[x][y] - sum[x][j-1] - sum[i-1][y]+sum[i-1][j-1] == 0){//判断是否全是0可不可以贴，可以则让差分数组变
                    diff[i][j]++;
                    diff[i][y+1]--;
                    diff[x+1][j]--;
                    diff[x+1][y+1]++;
                }
            }
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                diff[i][j] += diff[i-1][j]+diff[i][j-1]-diff[i-1][j-1];
                if(diff[i][j] == 0&& grid[i-1][j-1] == 0){
                    return false;
                }

            }
        }
        return true;
    }
}