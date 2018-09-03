package Polymorphism;

class Father{
    int i =1;
    int out(){
        return i;
    }
}
class Son extends Father{
    int i=2;
    int out(){
        return i;
    }
}
public class FatherAndSon {


    public static void main(String[] args) {
//        Father father = new Son();
//        System.out.println(father.i);
//        System.out.println(father.out());

        Thread thread = new Thread(() -> System.out.println("Hello World!"));
        thread.start();

    }
}
