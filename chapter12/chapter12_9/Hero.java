package chapter12_9;

public class Hero extends Character {
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた！");
        m.hp -= 10;
    }
}
