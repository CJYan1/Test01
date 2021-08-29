package Demo02继承案例;
/*
创建学生类
 */

public class Student extends Person {

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    //填写反馈方法
    public void xieFanKui() {
        System.out.println(getName() + "填写反馈！");
    }
}
