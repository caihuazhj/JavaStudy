package TestObject;

import java.util.HashMap;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode()*37+age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((People)obj).name) && this.age== ((People)obj).age;
    }

    public static void main(String[] args) {
        People people = new People("jack",13);
        System.out.println(people.hashCode());

        HashMap<People,Integer> map = new HashMap<>();

        map.put(people,1);
        people.setAge(11);
        System.out.println(map.get(people));
    }
}
