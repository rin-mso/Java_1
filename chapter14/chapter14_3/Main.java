package chapter14_3;

import static java.lang.System.*;

// どんなインスタンスでも受け取れるメソッド
public class Main {
    public void printAnything(Object o) {
        // 何型でもいいから、引数を一つ受け取り画面に表示
        out.println(o.toString());
    }
}
