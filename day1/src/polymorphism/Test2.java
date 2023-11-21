package polymorphism;

public class Test2 {
    public static void main(String [] args){
        Inter i = new Interimpl();
        i.method();
    }
}
interface Inter{
    void method();
}
class Interimpl implements Inter {
    @Override
    public void method() {
        System.out.println("method....");
    }
}
