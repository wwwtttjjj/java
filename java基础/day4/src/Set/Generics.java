package Set;

public class Generics {
    public static void main(String[] args) {

    }
}
interface Inter<E>{
    void show(E e);
}
class InterAImp implements Inter<String>{
    @Override
    public void show(String e){
        System.out.println("a");
    };

}
class InterBImp<E> implements Inter<E>{
    @Override
    public void show(E e) {

    }
}
