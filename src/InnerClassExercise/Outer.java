package InnerClassExercise;

/**
 * Exercise1
 * Write a class named Outer that contains an inner class named Inner.
 * Add a method to Outer that returns an object of type Inner. In main( ), create and
 * initialize a reference to an Inner.
 */
public class Outer {
     class Inner{
        Inner(){
            System.out.println("Inner");
        }
     }
     //无参构造
//    Outer() {
//        System.out.println("Outer()");
//    }
    Inner CreateInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.CreateInner();

        Outer.Inner inner1 = outer.CreateInner();
    }
}
