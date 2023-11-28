import java.util.Deque;
import java.util.ArrayDeque;
public class _11_28 {
    public static void main(String [] args){
        FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
        obj.pushFront(1);
        obj.pushMiddle(2);
        obj.pushBack(3);
        System.out.println(obj.l);
        int param_4 = obj.popFront();
        int param_5 = obj.popMiddle();
        int param_6 = obj.popBack();

    }
}
class FrontMiddleBackQueue {
    Deque<Integer> l = new ArrayDeque<>(1010), r = new ArrayDeque<>(1010);

    public void pushFront(int val) {
        l.addFirst(val);
        update();

    }

    public void pushMiddle(int val) {
        l.addLast(val);
        update();


    }

    public void pushBack(int val) {
        r.addLast(val);
        update();
    }

    public int popFront() {
        if (l.size() + r.size() == 0) return -1;
        int ans = l.size() != 0 ? l.pollFirst() : r.pollFirst();
        update();
        return ans;

    }

    public int popMiddle() {
        if (l.size() + r.size() == 0) return -1;
        int ans = l.size() == r.size() ? l.pollLast() : r.pollFirst();
        update();
        return ans;
    }

    public int popBack() {
        if (l.size() + r.size() == 0) return -1;
        int ans = r.pollLast();
        update();
        return ans;

    }
    public void update() {
        while (l.size() > r.size()) r.addFirst(l.pollLast());
        while (r.size() - l.size() > 1) l.addLast(r.pollFirst());
    }
}