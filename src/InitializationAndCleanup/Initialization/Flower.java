package InitializationAndCleanup.Initialization;

//calling constructor with this
//在构造器中，当this添加参数列表，将会产生对符合参数列表的某个构造器的调用
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    public Flower(int petals) {
        petalCount = petals;
        System.out.println("只有int参数的构造方法,petalCount="+petalCount);
    }

    public Flower(String ss) {
        s = ss;
        System.out.println("只有string参数的构造方法，s="+s);
    }

    public Flower(int petalCount, String s) {
        this(petalCount);
//        Call to 'this()' must be first statement in constructor body
//        this(s); 只能调用一次
        this.s = s; //this 的另一种用法
        System.out.println("带两个参数的构造方法");
    }

    public Flower() {
        this(47,"hi");
        System.out.println("默认无参构造");
    }
    void printPetal(){
//        Call to 'this()' must be first statement in constructor body
//        this(11);//this()方法只能在构造函数中调用
        System.out.println("petalCount="+petalCount+",s="+s);
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetal();
    }
}
