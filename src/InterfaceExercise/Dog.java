package InterfaceExercise;

public class Dog implements Animals {


    @Override
    public void eat(Object object) {

        System.out.println(object+"吃");
    }

    @Override
    public void sleep(Object object) {

    }

    @Override
    public void walk(Object object) {

    }

    @Override
    public void eat(String s) {

        System.out.println(s);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(dog);
        dog.eat("骨头");
    }
}
