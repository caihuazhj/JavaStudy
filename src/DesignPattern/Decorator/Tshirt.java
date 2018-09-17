package DesignPattern.Decorator;

public class Tshirt implements Person {
    private Person person;

    public Tshirt(Person person){
        this.person = person;
    }
    @Override
    public void show() {
        System.out.println("拿到 T-shirt");
        person.show();
        System.out.println("穿上了t-shirt");
    }
}
