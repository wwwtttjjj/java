package Tostring;

public class Test {
    public static void main(String []args){
        student s1 = new student("1",2);
        student s2 = new student("1", 2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}

