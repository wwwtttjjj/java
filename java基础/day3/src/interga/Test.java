package interga;

public class Test {
    public static void main(String [] args){
        int num = 10;
        Integer i1 = Integer.valueOf(num);
        int i = i1.intValue();
        System.out.println(i1);
        System.out.println(i);
        String o = "123";
        int num1 = 10;
        Integer i2 = num1;
        int i3 = i2;
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.parseInt(o));



    }
}
