package DesignPattern.Proxy;

public class Proxy implements GiveGifts {

    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    public void giveFlowers(){
        System.out.println("我是李明");
        gg.giveFlowers();//调用追求者的方法
    }

}
