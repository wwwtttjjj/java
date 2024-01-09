import java.util.ArrayList;
import java.util.List;

public class _12_25 {
    public static void main(String[] args) {
        Solution1225 s = new Solution1225();

        System.out.println( s.numOfBurgers(2,1));

    }
}
class Solution1225 {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        //如果tomatoSlices是单数或者单个数量全做完还是不够或者超出则直接返回
        if (tomatoSlices % 2 != 0 || cheeseSlices * 2 > tomatoSlices || cheeseSlices * 4 < tomatoSlices){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //解方程？
        int remain = tomatoSlices - cheeseSlices * 2;
        ans.add(remain / 2);
        ans.add(cheeseSlices - (remain / 2));
        return ans;

    }
}