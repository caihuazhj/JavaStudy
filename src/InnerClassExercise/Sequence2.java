package InnerClassExercise;

/**
 * Create a class that holds a String, and has a toString( ) method that
 * displays this String. Add several instances of your new class to a Sequence object, then
 * display them.
 */
class Name{
    private String name;
    public Name(String s){
        name = s;
    }

    public String toString() {
        return name;
    }
}

public class Sequence2 {
    private Object[] items;
    private int next = 0;
    public Sequence2(int size) {
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
    }
    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {

        Sequence2 sequence1 = new Sequence2(5);
        for (int i = 0;i<sequence1.items.length;i++){
            sequence1.add(new Name(Integer.toString(i)));
        }
        Selector selectors = sequence1.selector();
        while (!selectors.end()){
            System.out.println(selectors.current());
            selectors.next();
        }

        Sequence2 sequence2 = new Sequence2(10);
        Name n1 = new Name("jack");
        Name n2 = new Name("rose");
        Name n3 = new Name("evan");
        Name n4 = new Name("tony");
        Name n5 = new Name("stack");

        sequence2.add(n1);
        sequence2.add(n2);
        sequence2.add(n3);
        sequence2.add(n4);
        sequence2.add(n5);

        Selector selector = sequence2.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }

}
