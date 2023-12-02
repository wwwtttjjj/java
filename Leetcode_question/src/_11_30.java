import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
public class _11_30 {
    public static void main(String [] args){
        String word1 = "abc";
        String word2 = "acb";
        Solution_1 s = new Solution_1();
        System.out.println(s.closeStrings(word1, word2));

    }

}
class Solution_1 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int [] s1 = new int [26];
        int [] s2 = new int [26];
//        List<Integer> s1 = new ArrayList<>(26);
//        List<Integer> s2 = new ArrayList<>(26);

        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();

        for(int i = 0; i < word1.length(); i++){
            int char1 = Integer.valueOf(arr1[i]);
            int char2 = Integer.valueOf(arr2[i]);
            s1[char1 - 97] += 1;
            s2[char2 - 97] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (s1[i] > 0 && s2[i] == 0 || s1[i] == 0 && s2[i] > 0) {
                return false;
            }
        }
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }
}