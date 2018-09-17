package DesignPattern.Decorator;

public class BigTrouser implements Person{
    private Person person;


    public BigTrouser(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        System.out.println("拿到裤子了");
        person.show();
        System.out.println("穿上裤子了");
    }
}
