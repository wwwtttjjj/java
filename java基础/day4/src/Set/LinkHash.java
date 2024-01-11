package Set;

import java.util.LinkedHashSet;

public class LinkHash {
    public static void main(String[] args) {
        //去重并保证存储顺序
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");
        lhs.add("e");
        lhs.add("f");
        lhs.add("g");
        lhs.add("h");
        System.out.println(lhs);
    }
}
