package DesignPattern.Proxy;

/**
 * 代理模式测试类
 * 代理模式核心思想：代理类和真正类具有公共接口，代理类保存一个引用，使得代理可以访问实体
 * 故事背景：李明喜欢珍妮，但是不敢说，假装丹尼送珍妮东西，最终黎明和珍妮在一起
 *          即李明代理丹尼送珍妮花，珍妮不认识丹尼
 */
public class Test {
    public static void main(String[] args) {
        SchoolGirl janny = new SchoolGirl();
        janny.setName("珍妮");
        /**
         * 没有代理时，丹尼送珍妮花，但是珍妮不认识
         */
        //追求者对象
//        Pursuit danny = new Pursuit(janny);
//        danny.giveFlowers();
        /**
         * 只有代理对象，此时变成李明直接送花，暴露了
         */
        //代理对象 李明
//        Proxy liming = new Proxy(janny);
//        liming.giveFlowers();

        Proxy liming = new Proxy(janny);
        liming.giveFlowers();
    }
}
