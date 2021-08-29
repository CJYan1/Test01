package Demo03超级玛丽案例;
/*
编写测试类，实现功能目标
 */

public class Demo01 {
    public static void main(String[] args) {

        SuperMario mario = new SuperMario();
        mario.setName("Mario");//父类变量
        mario.setImageName("mario.jpg");//父类变量
        mario.setTotalScore(100); //子类变量
        mario.run(); //父类行为
        mario.fire();
        mario.tread();
        System.out.println(mario.getName() + ", " + mario.getImageName() + ", " + mario.getTotalScore());
        System.out.println("-------------");

        Mushroom mushroom = new Mushroom();
        mushroom.setName("蘑菇怪");
        mushroom.setImageName("mushroom.jpg");
        mushroom.setScore(10); //子类变量
        mushroom.run(); //父类变量
        mushroom.crash();
        System.out.println(mushroom.getName() + ", " + mushroom.getImageName() + ", " + mushroom.getScore());
        System.out.println("------------");

        Tortoise tortoise = new Tortoise();
        tortoise.setName("啪嗒龟");
        tortoise.setImageName("tortoise.jpg");
        tortoise.setColor("黑色");
        tortoise.run();
        System.out.println(tortoise.getName() + ", " + tortoise.getImageName() + ", " + tortoise.getColor());
        System.out.println("------------");

    }
}
