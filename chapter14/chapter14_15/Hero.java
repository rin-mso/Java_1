package chapter14_15;

import static java.lang.System.*;

// 静的メソッドから非性的メソッドを利用（エラー）
public class Hero {
    String name;
    int hp;
    static int money;
    /* ... */
    public static void setRandomMoney() {
        Hero.money = (int)(Math.random() * 1000);
        out.println(this.name + "たちの所持金を初期化しました。");
    }
}
