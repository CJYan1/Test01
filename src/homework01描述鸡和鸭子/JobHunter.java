package homework01描述鸡和鸭子;
/*
求职者（jobhunter）：属性有（名称，年龄，性别 ，职位方向）行为：显示界面 ，选择职位投递。
 */

public class JobHunter extends User {
    private String direction;

    public void showInterface() {
        System.out.println("您好，欢迎" + getName() + "先生，年龄" + getAge() + "岁，性别" + getSex() + "进入系统");
        System.out.println("您好：" + getName() + (getSex() == "男" ? "先生" : "女士") + "已经为您展示了选择职位投递的界面");
    }

    //选择职位投递的方法
    public void chooseJobs() {
        System.out.println(getName() + "的职业方向是："+ direction +"，选择投递了：" + Position.position.get(3));
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
