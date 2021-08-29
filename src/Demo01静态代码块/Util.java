package Demo01静态代码块;
/*
定义工具类存储计算平均数方法
 */


public class Util {

    //用private修饰无参构造方法，其它类就不能使用构造器创建对象
    private Util() {

    }

    public static double getAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
