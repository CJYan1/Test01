package Demo03超级玛丽案例;


public class SuperMario extends Role {

    private int totalScore;

    public void fire() {
        System.out.println(getName() + "发射子弹");
    }

    public void tread() {
        System.out.println(getName() + "踩踏怪物");
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
