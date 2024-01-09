package Set;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();
        hs.add(new Student(1,"2"));
        hs.add(new Student(2,"2"));
        hs.add(new Student(3,"65"));
        hs.add(new Student(4,"5"));
        hs.add(new Student(6,"4"));
        hs.add(new Student(7,"3"));
        hs.add(new Student(8,"2"));
        hs.add(new Student(2,"2"));
        //保持元素唯一equals和hashcode要一起使用
        System.out.println(hs);

    }
}
