package Liu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");
        //1.男演员只要名字为三个字的前两人
        Stream<String> man1 = manList.stream().filter(s -> s.length() == 3).limit(2);
        //2.女演员只要第一个并且只要要林开头
        Stream<String> woman1 = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
        //3.1和2 combine
        Stream<String> concat1 = Stream.concat(man1, woman1);
        //4遍历
        concat1.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                Actor a = new Actor(name);
                System.out.println(a);

            }
        });


    }
}
class Actor{
    private String name;
    public Actor(){

    }

    public Actor(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}