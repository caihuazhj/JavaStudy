package AccessControl.JavaAccessSpecifiers;

public class IceCream {
    public static void main(String[] args) {
        //Sundae sundae = new Sundae();//Sundae()' has private access in
        Sundae.makeASundae();
        Cookie cookie = new Cookie();
//        cookie.s = "aaa";
    }
}
