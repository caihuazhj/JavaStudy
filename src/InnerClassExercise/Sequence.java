package InnerClassExercise;

//: innerclasses/Sequence.java
// Holds a sequence of Objects.
interface Selector {
    boolean end();
    Object current();
    void next();

}
public class Sequence {
    private Object[] items;
    private int next = 0;
    // to test SequenceSelector sequence() in main():
    public void test(){
        System.out.println("sequence test");
    }
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }

        //EXERCISE4
        //Add a method to the class Sequence.SequenceSelector that produces
        //the reference to the outer class Sequence.
        public Sequence outClass(){
            return Sequence.this;
        }

    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public class InnerString{
        String s;
        public void showString(String s){
            System.out.println(s.toString());
        }
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        //test
        ((SequenceSelector)selector).outClass().test();
    }
}
