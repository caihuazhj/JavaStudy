package AccessControl.JavaAccessSpecifiers;

/**
 * 测试private关键字在别的类中无法访问
 */
public class Sundae {
    private Sundae() {}
    static Sundae makeASundae(){
        System.out.println("makeASundae");
        return new Sundae();
    }
}
