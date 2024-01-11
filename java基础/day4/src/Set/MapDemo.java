package Set;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiConsumer;

public class MapDemo {
    /*
    HashMap：键唯一（重新写hashCode和equals方法）
    TreeMap：值唯一（Comparable接口,CompareTo方法）
    LinkedHashMap：键唯一且可以保证存取顺序

     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","2");
        map.put("2","3");
        map.put("3","4");
        map.put("5","6");
        map.put("7","8");
        System.out.println(map);
        //返回值被覆盖的旧值
        System.out.println(map.put("7","9"));

        HashMap<String, String> hm = new HashMap<>();
        hm.put("1", "2");
        hm.put("2", "4");
        hm.put("3", "5");
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"_____"+entry.getValue());

        }

        hm.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+value);
            }
        });
        hm.forEach((key, value)-> System.out.println(key+value));//lambda表达shi

        //test
        String info = "ababc";
        //map
        TreeMap<Character, Integer> tm = new TreeMap<>();
        char [] charArray = info.toCharArray();
        for(char c: charArray){
            if(!tm.containsKey(c)){
                tm.put(c,1);
            }
            else{
                tm.put(c,tm.get(c)+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        tm.forEach((k, v) -> sb.append(k).append("(").append(v).append(")"));
        System.out.println(sb);
        //test2
        HashMap<String, List<String>> hm2 = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "1","2","3","4");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "5","6","7","8");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "9","10","11","12");
        hm2.put("1",list1);
        hm2.put("5",list2);
        hm2.put("9",list3);

        Set<Map.Entry<String, List<String>>> entries1 = hm2.entrySet();
        for (Map.Entry<String, List<String>> entry : hm2.entrySet()) {
            String key = entry.getKey();
            System.out.print(key + '=');

            List<String> list0 = entry.getValue();
            for(int i = 0; i < list0.size() - 1; i++){
                System.out.print(list0.get(i) + ",");
            }
            System.out.println(list0.get(list0.size() - 1));

        }
        }

}
