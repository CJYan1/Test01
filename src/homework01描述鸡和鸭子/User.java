package homework01描述鸡和鸭子;
/*
定义用户类为父类
 */

public class User {
    private String name;
    private int age;
    private String sex;

    //定义显示界面的方法
    public void showInterface() {
        System.out.println("您好，欢迎" + name + "先生，年龄" + age + "岁，性别" + sex + "进入系统");
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
