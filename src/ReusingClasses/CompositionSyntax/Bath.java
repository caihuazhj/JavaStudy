package ReusingClasses.CompositionSyntax;

class Soap {
    private String s;
     Soap() {
         System.out.println("Soap()");
         s = "Constructed";
    }
    public String toString() { return s; }
}
public class Bath {
    private String // Initializing at point of definition:定义时初始化：
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        System.out.println("Inside Bath()");
        //类的构造器中初始化
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    // Instance initialization:
    //使用实例初始化
    { i = 47;}
    public String toString() {
        if(s4 == null) // Delayed initialization:惰性初始化
            s4 = "Joy";
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }
    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
