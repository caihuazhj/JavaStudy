package CollectionExercise;


import java.util.*;

public class e1 {

    public static void main(String[] args) {
        List<String> lis = new ArrayList();
            lis.iterator();

        ListIterator<String> listIterator = new ListIterator<String>(){

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public String previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(String s) {

            }

            @Override
            public void add(String s) {

            }
        };
    }

}
