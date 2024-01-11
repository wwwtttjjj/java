package polymorphism;

public class Test1 {
    public static void main(String[] main){
        Animal a1 = new dog();
        Animal a2 = new cat();
        useAnimal(a1);
        useAnimal(a2);

    }
    public static void useAnimal(Animal a){
        a.eat();
    }

}
 abstract class Animal{
    public abstract void eat();
 }
 class dog extends Animal{
     @Override
     public void eat() {
         System.out.println("dog eat");
     }
 }

class cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}