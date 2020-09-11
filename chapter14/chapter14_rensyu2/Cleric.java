package chapter14_rensyu2;

public class Cleric {
    String name;
    int hp = 50;
    static final int MAX_HP = 50;   // 改良箇所
    int mp = 10;
    static final int MAX_MP = 10;   // 改良箇所

    public void selfAid() {
        System.out.println(this.name + "は、セルフエイドを使った");
        this.mp -= 5;
        this.hp = Cleric.MAX_HP;
        System.out.println(this.name + "のHPが最大まで回復した！");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は祈った");

        // 回復するMPを決定する
        int recoverMp = new java.util.Random().nextInt(3) + sec;

        // 実際のMPの回復量を計算する
        int recoverAct = Math.min(Cleric.MAX_MP - this.mp, recoverMp);

        this.mp += recoverAct;
        System.out.println(this.name +"のMPが" + recoverAct + "回復した");
        return recoverAct;
    }
}
