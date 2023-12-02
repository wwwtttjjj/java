import java.util.Currency;
import java.util.TreeSet;
import java.util.ArrayDeque;
public class _11_29 {
    public static void main(String [] args){

    }
}
class SmallestInfiniteSet {
    int currentNum = 1000;
    private TreeSet<Integer> l = new TreeSet<>();

    public int popSmallest() {
        if (l.size() != 0){return l.pollFirst();}
        else{
            int val = 1001 - currentNum;
            currentNum --;
            return val;
        }
    }

    public void addBack(int num) {
        if ((1001 - currentNum) > num)l.add(num);
    }
}
