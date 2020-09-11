package chapter15_4;

// StringBuilderを利用し文字列を１万回連結する
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("Java");
        }
        String s = sb.toString();
    }
}
