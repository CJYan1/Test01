package Demo02继承案例;
/*
编写教师类
 */

public class Teacher extends Person {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    //编写发布考试方法
    public void faBuKaoShi() {
        System.out.println(getName() + "发布考试");
    }
}
