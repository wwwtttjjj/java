package Set;

import java.util.Comparator;
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
        t.add(new Student(1,"2"));
        t.add(new Student(1,"2"));
        t.add(new Student(3,"2"));
        System.out.println(t);


        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        //同时具备的话优先比较器

    }
}
