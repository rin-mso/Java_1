package chapter14_13;

// 所持金をランダムに設定する
public class Hero {
    String name;
    int hp;
    static int money;
    /* ... */
    public static void setRandomMoney() {
        Hero.money = (int)(Math.random() * 1000);
    }
}
