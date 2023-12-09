import java.util.ArrayList;
import java.util.List;

public class _12_7 {
    public static void main(String[] args) {
        Solution127 s = new Solution127();
        int [][] connection = new int [][]{{0,1},{1,3},{2,3},{4,0},{4,5}};
        s.minReorder(6, connection);

    }
}

class Solution127 {
    public int minReorder(int n, int[][] connections) {
        //就是对0去遍历所有点。
        List<int []>[] next = new List[n];
        for (int i = 0; i < n; i++){
            next[i]=new ArrayList<int []>();
        }
        for (int [] connection:connections){
            next[connection[0]].add(new int[]{connection[1], 1});
            next[connection[1]].add(new int[]{connection[0], 0});

        }

        return dfs(0, -1, next);

    }
    public int dfs(int x, int parent,List<int []>[] next){
        int res = 0;
        for (int[] edge: next[x]){
            if (edge[0] == parent){
                continue;
            }
            res += edge[1] + dfs(edge[0], x, next);

        }
        return res;

    }
}
