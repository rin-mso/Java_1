package chapter15_8;

import static java.lang.System.*;

// replaceAllメソッドを使った文字列の置換
public class Main {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        String w = s.replaceAll("[beh]", "X");
        out.println(w);
    }
}
