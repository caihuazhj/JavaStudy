package Polymorphism;

public class Animal {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void shout(){
        System.out.println("我是谁");
    }
    public void eat(){
        System.out.println("吃什么");
    }
}
