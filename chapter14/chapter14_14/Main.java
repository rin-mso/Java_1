package chapter14_14;

import static java.lang.System.*;

// newせずとも静的メソッドは呼び出し可能
public class Main {
    public static void main(String[] aegs) {
        Hero.setRandomMoney();
        out.println(Hero.money);    // ランダムな金額を表示
        Hero h1 = new Hero();
        out.println(h1.money);      // 同じ金額を表示
    }
}
