package FileCLass;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("src//FileClass//a.txt");
//        f1.createNewFile();
//        File f2 = new File("src//FileClass2");
//        f2.mkdirs();
//        f1.delete();
//        f2.delete();//delete只能删除空文件夹

//        File f = new File("src");
//        File[] files = f.listFiles();
//        for(File file:files){
//            System.out.println(file);
//        }
        File dir = Test1.getDir();
        printJavaFile(dir);
    }
    public static void printJavaFile(File dir){
        File [] files = dir.listFiles();
        for(File file:files){
            if(file.isFile()){
                if(file.getName().endsWith(".java")){
                    System.out.println(file);
                }
            }
            else{
                if (file.listFiles() != null){
                    printJavaFile(file);

                }
            }
        }
    }
}
