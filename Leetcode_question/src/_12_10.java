public class _12_10 {
    public static void main(String[] args) {

    }
}
class Solution1210 {
    public int climbStairs(int n) {
        int behind = 1;
        int foreast = 1;
        for(int i = 1; i < n; i++){
            int temp = behind + foreast;
            behind = foreast;
            foreast = temp;
        }
        return foreast;

    }
}
