package RTTI.ObjectClass;



class Candy {
    static {
        System.out.println("Loading Candy");
    }

    public Candy() {
        System.out.println("candy loaded");
    }
}
class Gum {
    static {  System.out.println("Loading Gum"); }
}
class Cookie {
    static {  System.out.println("Loading Cookie"); }
}
public class SweetShop {
    public static void main(String[] args) {

         System.out.println("inside main");
        new Candy();
         System.out.println("After creating Candy");
        try {
            Class.forName("RTTI.ObjectClass.Gum");//包含路径
        } catch(ClassNotFoundException e) {
             System.out.println("Couldn’t find Gum");
        }
         System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
         System.out.println("After creating Cookie");
    }

}
