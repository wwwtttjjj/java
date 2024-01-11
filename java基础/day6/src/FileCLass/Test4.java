package FileCLass;

import java.io.File;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test4 {
    static HashMap<String, Integer> hm = new HashMap<>();
    static int count = 0;

    public static void main(String[] args) {
        File dir = Test1.getDir();
        getCount(dir);
        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+":"+value+"个");
            }
        });
        System.out.println("没有后缀名的文件个数为:"+count);

    }
    public static void getCount(File dir){
        File[] files = dir.listFiles();
        for(File file:files){
            if (file.isFile()){
                String fileName = file.getName();
                if (fileName.contains(".")){
                    String [] sArr = fileName.split("\\.");
                    String type = sArr[sArr.length - 1];
                    //统计
                    if(!hm.containsKey(type)){
                        hm.put(type,1);
                    }
                    else{
                        hm.put(type, hm.get(type)+1);
                    }

                }
                else{
                    //没有后缀名

                    count++;
                }

            }
            else{
                if(file.listFiles()!=null){
                    getCount(file);
                }

            }
        }
    }
}
