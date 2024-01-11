package zhengze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args){
        /*
        [abc]只能是abc中的其中一个,[]代表的是对单个字符做限制
        [^abc]除了abc中的其他字符都可以
        [a-zA-z]a到z，A到Z都可以
        [a-d[m-p]]a到d或者m到p,也可以这样写[a-d,m-p]
        [a-z&&[def]]取交集
        [a-z&&[^bc]]a-z除了b和c
        [a-z&&[^m-p]]a-z中除了m到p
         */
        /*
        2预定义字符
        .   任意字符
        \d  一个数字[0-9]
        \D  非数字:[^0-9]
        \s  一个空白字符
        \S  非空白字符
        \w  [a-zA-Z_0-9]英文数字下划线
        \W  [^\w] 一个非单词符
         */
        /*
        X?  X，一次或者0次
        X*  X,零次或者多次
        X+，X，一次或者多次
        X {n}   X正好n次
        X {n, } X至少n次
        X{n,m}  X至少n但不超过m次

         */
        String data = "12334";
        String regex = "[abc]";
        System.out.println("1".matches(regex));
        String qqRegex = "[1-9]\\d{4,11}";
        String phoneRegex = "[1][3-9]\\d{9}";
        String emailRegex = "\\w+@[\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("101949@qq.com".matches(emailRegex));

        Pattern pattern = Pattern.compile(qqRegex);
        Matcher matcher = pattern.matcher(data);
        while(matcher.find()){
            System.out.println(matcher.group());

        }
    }
}
