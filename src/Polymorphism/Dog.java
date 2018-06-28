package Polymorphism;

public class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }

    public void eat(){
        System.out.println("i eat bones");
    }
}
