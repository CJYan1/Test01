package homework01描述鸡和鸭子;
/*
定义静态集合用于存储职位信息，使用静态代码块初始化职位信息
 */

import java.util.ArrayList;

public class Position {

    public static ArrayList<String> position = new ArrayList<>();

    static {
        position.add("会计");
        position.add("销售");
        position.add("金融");
        position.add("开发工程师");
    }

    public static void main(String[] args) {
        System.out.println("初始化存在的职位信息：" + position);

        //创建管理员对象
        Admin admin = new Admin();
        admin.setName("超级管理员");
        admin.setAge(32);
        admin.setSex("男");
        admin.showInterface();
        admin.addJobs();
        System.out.println("-----------");

        //创建HR对象
        HR hr = new HR();
        hr.setName("波妞");
        hr.setAge(25);
        hr.setSex("女");
        hr.setCompany("传智播客");
        hr.showInterface();
        hr.showJobs();
        System.out.println("----------");

        //创建求职者对象
        JobHunter jh = new JobHunter();
        jh.setName("大朗");
        jh.setAge(24);
        jh.setSex("男");
        jh.setDirection("Java全栈工程师");
        jh.showInterface();
        jh.chooseJobs();
    }

}
