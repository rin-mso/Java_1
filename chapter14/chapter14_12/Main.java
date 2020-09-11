package chapter14_12;

import static java.lang.System.*;

// newせずとも静的フィールドは利用可能
public class Main {
    public static void main(String[] args) {
        // １人も勇者を生み出していない状況で･･･
        Hero.money = 100;
        out.println(Hero.money);
    }
}
