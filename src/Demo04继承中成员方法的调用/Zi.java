package Demo04继承中成员方法的调用;
/*
在子类中创建成员方法（与父类中同名）
 */

public class Zi extends Fu {

    public void test01() {
        System.out.println("这是Zi类中的test01");
    }

    public void test02(){
        this.test01();
        super.test01();
    }

}
