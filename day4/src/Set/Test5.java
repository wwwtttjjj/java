package Set;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Coder> list1 = new ArrayList<>();
        list1.add((new Coder()));

        ArrayList<Manager> list2 = new ArrayList<>();
        list2.add((new Manager()));
        method(list1);
        method(list2);

    }
    public static void method(ArrayList<? extends Employee> list){
        for (Object o:list){
            Employee e = (Employee) o;
            e.work();
        }
    }
}
 abstract class Employee{
    public abstract void work();
 }
 class Coder extends Employee{
     @Override
     public void work() {
         System.out.println("working for code");
     }
 }
class Manager extends Employee{
    @Override
    public void work() {
        System.out.println("responsibility for coder");
    }
}