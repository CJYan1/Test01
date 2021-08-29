package Demo06斗地主案例;
/*
静态代码块构建斗地主游戏
 */

import java.util.ArrayList;

public class Demo01 {

    private static ArrayList<String> pokers = new ArrayList<>();

    //创建静态代码块
    static {
        pokers.add("大王");
        pokers.add("小王");
        pokers.add("A");
        pokers.add("2");
        pokers.add("3");
        pokers.add("4");
        pokers.add("5");
        pokers.add("6");
        pokers.add("7");
        pokers.add("8");
        pokers.add("9");
        pokers.add("10");
        pokers.add("J");
        pokers.add("Q");
        pokers.add("K");
    }

    public static void main(String[] args) {
        System.out.println("初始化的牌：" + pokers);
    }
}
