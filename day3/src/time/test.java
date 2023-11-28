package time;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class test {
    /*
    计算你来到了这个世界多少天
     */
    public static void main(String [] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日：xxxx年xx月xx日");
        String birthday = sc.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Data birthdayData = (Data) simpleDateFormat.parse(birthday);
//        Data today = new Data();
//        long time = today.getTime() - birthdayData.getTime();
//        System.out.println(1 / 1000 / 60 / 60 / 24);

    }
}
