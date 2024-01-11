package test;
import java.util.Scanner;
public class Test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the pay form:1:bank2:platform");
        int choice = sc.nextInt();
        Payment payment = null;
        switch (choice){
            case 1 :
                payment = new BankcardPayment();
                break;
            case 2:
                payment = new PlatformPaymentImpl();
                break;
            case 3:
                payment = new CreadicarImpl();
                break;
        }
        System.out.println("input the money num");
        double money = sc.nextDouble();
        payment.pay(money);

    }
}
