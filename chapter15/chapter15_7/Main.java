package chapter15_7;

import static java.lang.System.*;

// splitメソッドを使った文字列の分割
public class Main {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        String[] words = s.split("[,:]");
        for (String w : words) {
            out.print(w + "->");
        }
    }
}
