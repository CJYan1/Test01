package homework01描述鸡和鸭子;
/*
管理员(Admin): 属性有（名称，年龄，性别）行为：显示界面，管理职位种类的（添加，删除）
 */

import java.util.Scanner;

public class Admin extends User {

    public void showInterface(){
        System.out.println("您好，欢迎" + getName() + "先生，年龄" + getAge() + "岁，性别" + getSex() + "进入系统");
        System.out.println("您好：" + getName() + (getSex() == "男" ? "先生" : "女士")+"已经为您展示了职位信息管理界面");
    }

    public void addJobs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入添加的职位");
        String s = sc.nextLine();
        Position.position.add(s);
        System.out.println("添加完后全部职位是："+Position.position);
    }
}
