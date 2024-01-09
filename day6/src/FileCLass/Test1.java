package FileCLass;

import java.io.File;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        File dir = getDir();
        System.out.println(dir);

    }
    public static File getDir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        while(true) {
            String path = sc.nextLine();
            File dir = new File(path);

            if (!dir.exists()) {
                System.out.println("您输入的文件路径不存在，请重新输入:");
            } else if (dir.isFile()) {
                System.out.println("您输入的是一个文件路径，请重新输入一个文件夹路径：");

            } else {
                return dir;
            }
        }
    }
}
