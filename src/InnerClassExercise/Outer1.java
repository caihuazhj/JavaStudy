package InnerClassExercise;

/**
 * Modify Exercise 1 so that Outer has a private String field (initialized
 * by the constructor), and Inner has a toString( ) that displays this field. Create an object of
 * type Inner and display it.
 */
public class Outer1 {
    private  String s;
    Outer1(String s){
        System.out.println("Outer1()");
        this.s = s;
    }
    class Inner{

        Inner(){
            System.out.println("Inner");
        }
        public void outerString(){
            System.out.println(s);
        }
    }

    Inner CreateInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1("我爱静静");
        Inner inner = outer1.CreateInner();

        inner.outerString();
    }
}
