package homework01描述鸡和鸭子;

public class HR extends User {
    private String company;

    public void showInterface() {
        System.out.println("您好，欢迎" + getName() + "先生，年龄" + getAge() + "岁，性别" + getSex() + "进入系统");
        System.out.println("您好：" + getName() + (getSex() == "男" ? "先生" : "女士") + "已经为您展示了发布职位招聘的界面");
    }

    public void showJobs() {
        System.out.println("公司是：" + company + "的" + getName() + "选择发布了：" + Position.position.get(3));
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
