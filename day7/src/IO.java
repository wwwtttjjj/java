import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
    public static void main(String[] args) {
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("src//a.txt");
//            fos.write("abc".getBytes());
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            if(fos != null){
//                try {
//                    fos.close();
//
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//        }
        try(FileOutputStream fos = new FileOutputStream("src//a.txt");){
            fos.write("abc".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
