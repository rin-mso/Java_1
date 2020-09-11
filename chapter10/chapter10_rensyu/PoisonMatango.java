package chapter10_rensyu;

public class PoisonMatango extends Matango{
    int poisonCount = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);

        if(this.poisonCount > 0) {
            System.out.println("さらに毒をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            this.poisonCount--;
        }
    }
}
