package chapter14_11;

import static java.lang.System.*;

// 各インスタンスから静的フィールドを利用可能
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Hero.money = 100;
        out.println(Hero.money);    // 100と表示
        out.println(h1.money);      // 100と表示
        h1.money = 300;             // 300を代入
        out.println(h2.money);      // 300と表示
    }
}
