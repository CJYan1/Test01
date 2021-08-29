package Demo05继承中的构造器;
/*
定义子类
 */

public class Student extends Person {
    private double score;

    //子类的无参构造会默认调用父类的无参构造
    public Student() {
        super();
        System.out.println("我是子类无参构造");
    }

    //子类满参的构造方法标准做法
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
        System.out.println("我是子类满参构造");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
