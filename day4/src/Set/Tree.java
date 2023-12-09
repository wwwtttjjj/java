package Set;

import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
//        TreeSet<String> t = new TreeSet<String>();
//        t.add("1");
//        t.add("2");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        System.out.println(t);
        TreeSet<Student> t = new TreeSet<Student>();
        t.add(new Student(2,"2"));
        t.add(new Student(1,"2"));
        t.add(new Student(3,"2"));
        System.out.println(t);

    }
}
