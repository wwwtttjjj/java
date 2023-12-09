import java.util.ArrayList;
import java.util.List;

public class _12_5 {
    public static void main(String[] args) {

    }
}
class Solution125 {
    long res = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length;
        List<Integer>[] g = new List[n + 1];
        for (int i = 0; i <= n; i ++){
            g[i] = new ArrayList<Integer>();
        }
        for (int [] e : roads){
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        dfs(0, -1, seats, g);
        return res;
    }
    public int dfs(int cur, int fa, int seats, List<Integer>[] g){
        int peopleNumber = 1;
        for(int ne:g[cur]){
            if (ne != fa){
                int peopleCnt = dfs(ne, cur,seats, g);
                peopleNumber += peopleCnt;
                res += (peopleCnt + seats - 1) / seats;
            }
        }
        return peopleNumber;
    }
}
