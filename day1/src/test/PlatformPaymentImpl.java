package test;

public class PlatformPaymentImpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("Platform pay:"+money+"￥");

    }
}
