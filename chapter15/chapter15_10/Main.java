package chapter15_10;

import static java.lang.System.*;

// 処理時間を計測する
public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // ここで何らかの時間がかかる処理
        long end = System.currentTimeMillis();
        out.println("処理にかかった時間は･･･" + (end - start) + "ミリ秒でした");
    }
}
