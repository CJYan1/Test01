package Demo03超级玛丽案例;
/*
父类
 */
public class Role {
    private String name;
    private String imageName;

    public void run() {
        System.out.println(name + ", " + imageName + ", " + "角色在跑!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
