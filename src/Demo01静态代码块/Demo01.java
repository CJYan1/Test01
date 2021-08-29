package Demo01静态代码块;
/*
调用工具方法计算平均数
工具类的好处：
1、不用创建对象，
2、可以在多个地方使用
 */

public class Demo01 {
    public static void main(String[] args) {
        //通过类名调用工具类中的方法
        double average = Util.getAverage(100, 98, 98);
        System.out.println("average:" + average);
    }
}
