package Demo05继承中的构造器;
/*
测试构造器
 */

public class Demo01 {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("-----------");

        Student s2 = new Student("张全蛋", 20, 80);
        System.out.println(s2.getName() + ", " + s2.getAge() + ", " + s2.getScore());
    }
}
