package chapter12;

// 12-1
//public class Main {
//    public static void main(String[] args) {
//        Life lf = new Wizard();
//    }
//}

// 12-3
//public class Main {
//    public static void main(String[] args) {
//        Wizard w = new Wizard();
//        Matango m = new Matango();
//        w.name = "アサカ";
//        w.attack(m);
//        w.fireball(m);
//    }
//}

// 12-4
//public class Main {
//    public static void main(String[] args) {
//        Wizard w = new Wizard();
//        Character c = w;
//        Matango m = new Matango();
//        c.name = "アサカ";
//        c.attack(m);
//        c.fireball(m);
//    }
//}

// 12-5
public class Main {
    public static void main(String[] args) {
        Slime s = new Slime();
        Monster m = new Slime();
        s.run();
        m.run();
    }
}