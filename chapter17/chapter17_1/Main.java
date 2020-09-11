package chapter17_1;

import java.io.FileWriter;

// 例外処理を用意していないためエラーになる例
public class Main {
    public static void main(String[] args) {
        FileWriter fw = new FileWriter("data.txt");
    }
}
