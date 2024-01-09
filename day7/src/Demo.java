import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    /*
    copy a dir and the child dir
     */
    public static void main(String[] args) throws IOException {
        File src = new File("src\\test");
        File dest = new File("src\\test2");
        copyDir(src, dest);

    }
    public static void copyDir(File src, File dest) throws IOException {
        File newDir = new File(dest, src.getName());
        newDir.mkdirs();
        File [] files = src.listFiles();
        for(File file:files){
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(newDir, file.getName()));

                int len;
                byte[] bys = new byte[1024];
                while ((len = fis.read(bys))!=-1){
                    fos.write(bys,0,len);
                }
                fis.close();
                fos.close();
            }
            else {
                copyDir(file, newDir);
            }
        }

    }
}
