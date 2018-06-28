package Polymorphism;

public class Master {
    public void feed(Animal animal,Food food){
//        System.out.println(animal+"eat"+food);
        animal.eat();
        food.showName();
    }

    // 给动物喂食物，如果没有多态，他要写给猫喂食和给狗喂食两个方法
    // 有了多态，以后即使再来好多动物，用这一个函数就可以了
    //子类和父类有共同的接口
    public static void main(String[] args) {
        Master master =new Master();
//        master.feed(new Animal(),new Food());
        master.feed(new Dog(),new Bone());

        System.out.println("wang to miao");
        master.feed(new Cat(),new Fish());

    }
}
