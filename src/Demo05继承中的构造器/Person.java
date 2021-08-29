package Demo05继承中的构造器;
/*
定义父类
 */

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("我是父类无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是父类满参构造");
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
}
