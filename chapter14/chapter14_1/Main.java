package chapter14_1;

import static java.lang.System.*;

// 何も定義していないクラスでtoString()を呼ぶ
public class Main {
    public static void main(String Args[]) {
        Empty e = new Empty();
        String s = e.toString();
        out.println(s);
    }
}
