package AccessControl.access;

import AccessControl.JavaAccessSpecifiers.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("chocolateChip constructor");
    }
    public void chomp(){
       // bite();//  bite()' is not public in 'AccessControl.JavaAccessSpecifiers
        bite();//protected
    }

    public static void main(String[] args) {
        ChocolateChip chocolateChip = new ChocolateChip();
        chocolateChip.chomp();
    }
}
