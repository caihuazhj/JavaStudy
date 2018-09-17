package DesignPattern.Decorator;

public class Test {
    public static void main(String[] args) {
        Person person = new Finery();
        Person tshitr = new Tshirt(person);

        Person pants = new BigTrouser(tshitr);

        pants.show();
    }
}
