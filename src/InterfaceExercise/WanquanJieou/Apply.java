package InterfaceExercise.WanquanJieou;

import java.util.Random;

public class Apply {
    public static void process(Processer p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static String s =
            "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
//        process(new Upcase(), s);
//        process(new Lowcase(), s);
//        process(new Splitter(), s);
        Random rand = new Random();
        int a[]= new int[30];

        for(int i=0;i<30;i++){
            a[i] = rand.nextInt(4500-69750+1)+65000;
            System.out.println(a[i]);

        }
    }
}