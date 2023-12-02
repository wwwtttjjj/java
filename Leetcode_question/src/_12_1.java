public class _12_1 {
    public static void main(String [] args){
        Solution s = new Solution();
        int [] arr = new int []{1,4,5,2,6,3};
        int [][] mat = new int [][] {{4,3,5},{1,2,6}};
        int val = s.firstCompleteIndex(arr, mat);
        System.out.println(val);

    }
}
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] colum = new int[m];
        int[] row = new int[n];
        int[][] map_index = new int[m * n + 1][2];
        for (int j = 0; j < m; j++) {
            for (int z = 0; z < n; z++) {
                map_index[mat[j][z]][0] = j;
                map_index[mat[j][z]][1] = z;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            colum[map_index[arr[i]][0]]++;
            row[map_index[arr[i]][1]]++;
            if (colum[map_index[arr[i]][0]] == n || row[map_index[arr[i]][1]] == m) return i;

        }
        return -1;

    }
}