package DesignPattern.Decorator;

public class Finery implements Person {
    protected Person component;

    public void decorated(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        System.out.println("穿衣服");
    }
}
