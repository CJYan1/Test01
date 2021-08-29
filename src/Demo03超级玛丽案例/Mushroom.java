package Demo03超级玛丽案例;

public class Mushroom extends Role {

    private int score;

    public void crash() {
        System.out.println(getName() + "冲撞");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
