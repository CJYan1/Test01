package Demo02继承案例;
/*
编写父类，存储相同的特性
 */

public class Person {

    private String name;
    private String courseName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //定义共同的成员方法,查看课表
    public void lookClass() {
        System.out.println(name + "查看课表！");
    }
}
