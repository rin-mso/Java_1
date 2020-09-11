package chapter15_11;

import java.util.Date;
import static java.lang.System.*;

// 現在の日時を表示する
public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        out.println(now);
        out.println(now.getTime());
        Date past = new Date(1600705425827L);
        out.println(past);
    }
}
