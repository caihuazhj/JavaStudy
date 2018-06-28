package Polymorphism;

public class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("miaomiaomiao");
    }
    public void eat(){
        System.out.println("i eat fish");
    }
}
