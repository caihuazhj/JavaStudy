package DesignPattern.Proxy;

/**
 * 大话设计模式--代理模式
 * 追求者
 */
public class Pursuit implements GiveGifts {

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    public void giveFlowers(){

        System.out.println(mm.getName()+"有追求者送你花");//
    }
}
