package chapter10;

// コード10-2
//public class SuperHero {
//    String name = "ミナト";
//    int hp = 100;
//    boolean flying;
//
//    // 戦う
//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        m.hp -= 5;
//        System.out.println("5ポイントのダメージをあたえた！");
//    }
//
//    // 逃げる
//    public void run() {
//        System.out.println(this.name + "は逃げ出した！");
//    }
//
//    // 飛ぶ
//    public void fly() {
//        this.flying = true;
//        System.out.println("飛び上がった！");
//    }
//
//    // 着地する
//    public void land() {
//        this.flying = false;
//        System.out.println("着地した！");
//    }
//}

    // コード10-3
//    public class SuperHero extends Hero {
//        boolean flying;
//
//        public void fly() {
//        this.flying = true;
//        System.out.println("飛び上がった！");
//        }
//
//        public void land() {
//        this.flying = false;
//        System.out.println("着地した！");
//        }
//    }

    // コード10-4
//    public class SuperHero extends Hero {
//        boolean flying;
//
//        public void fly() {
//        this.flying = true;
//        System.out.println("飛び上がった！");
//        }
//
//        public void land() {
//        this.flying = false;
//        System.out.println("着地した！");
//        }
//
//        public void run() {
//            System.out.println(this.name + "は撤退した");
//        }
//    }

// コード10-8
//public class SuperHero extends Hero {
//    boolean flying;
//
//    public void fly() {
//    this.flying = true;
//    System.out.println("飛び上がった！");
//    }
//
//    public void land() {
//    this.flying = false;
//    System.out.println("着地した！");
//    }
//
//    public void run() {
//        System.out.println(this.name + "は撤退した");
//    }
//
//    public void attack(Matango m) {
//    System.out.println(this.name + "の攻撃！");
//    m.hp -= 5;
//    System.out.println("5ポイントのダメージをあたえた！");
//        if (this.flying) {
//            System.out.println(this.name + "の攻撃！");
//            m.hp -= 5;
//            System.out.println("5ポイントのダメージをあたえた！");
//        }
//    }
//}

// コード10-9
//public class SuperHero extends Hero {
//    boolean flying;
//
//    public void fly() {
//    this.flying = true;
//    System.out.println("飛び上がった！");
//    }
//
//    public void land() {
//    this.flying = false;
//    System.out.println("着地した！");
//    }
//
//    public void attack(Matango m) {
//        super.attack(m);
//        if(this.flying) {
//            super.attack(m);
//        }
//    }
//}

// コード10-10
public class SuperHero extends Hero {
    boolean flying;

    public SuperHero() {
        System.out.println("SuperHeroのコンストラクタが動作");
    }

    public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
    }

    public void land() {
    this.flying = false;
    System.out.println("着地した！");
    }

    public void attack(Matango m) {
        super.attack(m);
        if(this.flying) {
            super.attack(m);
        }
    }
}

