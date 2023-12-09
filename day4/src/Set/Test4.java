package Set;

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        extracted(list);
    }
    private static void extracted(LinkedList<String> list) {
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addLast("4");
        System.out.println(list);
    }
}
