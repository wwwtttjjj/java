package Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","b","c","d");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }
}
