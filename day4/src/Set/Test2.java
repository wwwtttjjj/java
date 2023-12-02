package Set;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();
        c.add(new Student(2,"1"));
        c.add(new Student(3,"2"));
        c.add(new Student(3,"3"));

        Iterator<Student> it = c.iterator();
//        Student s1 = it.next();
//        System.out.println(s1);
//        Student s2 = it.next();
//        System.out.println(s2);
        while(true){
            try{
                Student stu1 = it.next();
                System.out.println(stu1);
            }catch (NoSuchElementException e){
                break;
            }
        }
        //增强for循环
        for(Student stu: c){
            System.out.println(stu);
        }
        //
        c.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });
        c.forEach(student -> System.out.println(student));




    }
}
