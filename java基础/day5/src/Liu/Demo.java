package Liu;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo  {
    public static void main(String[] args) {
//        extracted();
//        extracted1();
//        extracted2();
        ArrayList<String> list = new ArrayList<>();
        list.add("张曼玉");
        list.add("林青霞");
        list.add("王祖贤");
        list.add("张敏");
        list.add("张无忌");
        list.add("柳岩");
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        }).forEach(s-> System.out.println(s));
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
        //limit 3
        list.stream().limit(3).forEach(s-> System.out.println(s));
        //skip 3
        list.stream().skip(2).forEach(s-> System.out.println(s));
        //skip 2 and limit 3
        list.stream().skip(2).limit(3).forEach(s-> System.out.println(s));
        //get front four
        Stream<String> s1 = list.stream().limit(4);
        //skip 2
        Stream<String> s2 = list.stream().skip(2);
        System.out.println("----------------------------------");
        Stream<String> s3 = Stream.concat(s1, s2);
        //消费过就不能在继续，指针？
//        s3.forEach(s-> System.out.println(s));
        //quchong
        s3.distinct().forEach(s-> System.out.println(s));
        //终结方法foreach and count
        //collections method (toSet, toList, ToMap)
        List<Integer> list1 = Stream.of(1, 2, 3, 4, 4, 5, 6, 7).filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        Set<Integer> list2 = Stream.of(1, 2, 3, 4, 4, 5, 6, 7).filter(s -> s % 2 == 0).collect(Collectors.toSet());
        System.out.println(list2);



    }

    private static void extracted2() {
        Stream.of(1,2,3,4).forEach(s-> System.out.println(s));
        Stream.of("1","1").forEach(s-> System.out.println(s));
    }

    private static void extracted1() {
        int [] arr = new int[] {1,23};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }

    private static void extracted() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.stream().forEach(k->System.out.println(k));
        Map<String, Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        entries.stream().forEach(s-> System.out.println(s));
    }
}
