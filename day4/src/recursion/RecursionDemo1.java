package recursion;

public class RecursionDemo1 {
    public static void main(String [] args){
        int result = monkeyEat(1);
        System.out.println(result);
    }
    public static int jc(int num){
        if (num == 1){
            return 1;
        }
        else{
            return num + jc(num - 1);
        }
    }
    public static int monkeyEat(int num){
        if (num == 10){
            return 1;
        }
        else{
            return (monkeyEat(num+1)+1)*2;
        }
    }
}
