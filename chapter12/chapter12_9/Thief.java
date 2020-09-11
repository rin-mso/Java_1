package chapter12_9;

public class Thief extends Character {
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に7ポイントのダメージをあたえた！");
        m.hp -= 7;
    }
}
