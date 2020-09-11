package chapter15_1;

import static java.lang.System.*;

// 文字列調査メソッドを利用した例
public class Main {
    public static void main(String[] args) {
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        if (s2.equals(s3)) {
            out.println("s2とs3は等しい");
        }
        if (s2.equalsIgnoreCase(s3)) {
            out.println("s2とs3はケースを区別しなければ等しい");
        }
        out.println("s1の長さは" + s1.length() + "です");

        if (s1.isEmpty()) {
            out.println("s1は空文字です");
        }
    }
}
