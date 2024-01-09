package FileCLass;

import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\A.txt");
        f1.createNewFile();
        //三种构造
        File f2 = new File("D:\\test");
        File f3 = new File("D\\","test");
        File f4 = new File(new File("D://"),"test");

        System.out.println(f1);

    }
}
