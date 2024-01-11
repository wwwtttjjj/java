package Set;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

    public static void main(String [] args){
        Collection<String> c = new ArrayList<>();
        //多态形式创建，只能用共有方法
        boolean b1 = c.add("1");
        boolean b2 = c.add("2");
        boolean b3 = c.add("3");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(c);
        System.out.println(c.isEmpty());

        System.out.println(c);
        System.out.println(c.isEmpty());
        c.remove("1");
        System.out.println(c.contains("2"));
        //contains方法和remove方法依赖类的equals方法操作。



    }
}
