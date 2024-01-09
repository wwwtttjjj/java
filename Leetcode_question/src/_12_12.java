import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _12_12 {
    public static void main(String[] args) {
        int [] nums = new int[]{1, 2, 4, 3};
        Solution1212 a = new Solution1212();
        int [] ans = a.secondGreaterElement(nums);
        System.out.println(ans);


    }
}
class Solution1212 {
    public int[] secondGreaterElement(int[] nums) {
        //双单调栈
        int n = nums.length;

        int [] res = new int[nums.length];
        Arrays.fill(res, -1);
        List<Integer> stack1 = new ArrayList<Integer>();
        List<Integer> stack2 = new ArrayList<Integer>();

        for (int i = 0; i < n; ++i){
            int v = nums[i];
            while(!stack2.isEmpty() && nums[stack2.get(stack2.size() - 1)] < v){
                res[stack2.get(stack2.size() - 1)] = v;
                stack2.remove(stack2.size() - 1);
            }
            int pos = stack1.size() - 1;
            while(pos >= 0 && nums[stack1.get(pos)] < v){
                --pos;
            }
            for (int j = pos + 1;j<stack1.size();j++){
                stack2.add(stack1.get(j));
            }
            for(int j = stack1.size()-1;j>=pos+1;j--){
                stack1.remove(j);

            }
            stack1.add(i);
        }
        return res;

    }
}
//class Solution1212 {
//    public int[] secondGreaterElement(int[] nums) {
//        //双重for循环内存肯定爆
//        if (nums.length == 1){
//            int [] answers = new int[] {-1};
//            return answers;
//
//        }
//        if (nums.length == 2){
//            int [] answers = new int[] {-1,-1};
//            return answers;
//        }
//
//        int [] answers = new int[nums.length];
//        answers[nums.length - 1] = -1;
//        answers[nums.length - 2] = -1;
//
//        for (int i = 0; i < nums.length - 2; i++){
//            int tag = 0;
//            for(int j = i + 1; j < nums.length;j++){
//                if (nums[j] > nums[i]){
//                    tag += 1;
//                }
//                if (tag == 2){
//                    answers[i] = nums[j];
//                    break;
//                }
//
//            }
//            if(tag != 1){
//                answers[i] = -1;
//            }
//
//        }
//        return answers;
//
//    }
//}
