package test;

public class CreadicarImpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("Creadicar pay:"+money+"￥");
    }
}
