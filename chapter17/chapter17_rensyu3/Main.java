package chapter17_rensyu3;

import static java.lang.System.*;

// 文字列を数値型に変換する際の例外
public class Main {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("三");
        } catch (NumberFormatException e) {
            out.println("NumberFormatException例外をcatchしました");
        }
    }
}
