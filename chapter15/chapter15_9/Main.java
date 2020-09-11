package chapter15_9;

import static java.lang.System.*;

// 桁を揃えてキャラクターを表示する
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "minato";
        hero.job = "magician";
        hero.gold = 100;

        final String FORMAT = "%-9s %-13s 所持金%,6d";
        String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
        out.println(s);
    }
}
