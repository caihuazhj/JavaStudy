package AccessControl.JavaAccessSpecifiers;

public class Cookie {
    private String s;
    public Cookie(){
        System.out.println("Cookie constructor");
    }
    protected void bite(){
        System.out.println("bite");
    }
}
