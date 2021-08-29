package Demo02继承案例;

public class Demo02 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("张全蛋");
        s1.setCourseName("JavaEE就业班");
        s1.setClassName("广州黑马JavaEE就业151期");
        s1.lookClass();
        s1.xieFanKui();

        Teacher t1 = new Teacher();
        t1.setName("雷军");
        t1.setCourseName("JavaEE");
        t1.setDepartmentName("小米科技有限公司");
        t1.lookClass();
        t1.faBuKaoShi();

    }
}
