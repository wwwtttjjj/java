package BLOCK_TEST;
//匿名内部类
public class BLOCK {
    public static void main(String [] args){
        useinter(new Inter_());
        useinter(new Inter(){
            @Override
            public void show(){
                System.out.println("匿名内部类的实现");
            }
        });
        useinter(() ->{System.out.println("lambda内部类的实现");});

    }
    public static void useinter(Inter i){
        i.show();

    }
}
interface Inter{
    void show();
}
class Inter_ implements Inter{
    @Override
    public void show(){
        System.out.println("imple");
    }
}
