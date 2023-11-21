package test;

public class BankcardPayment implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("Bankcard pay:"+money+"￥");
    }
}
