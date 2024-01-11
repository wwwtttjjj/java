package Set;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        while(it.hasPrevious()){
            String s = it.previous();
            System.out.println(s);
        }

    }
}
