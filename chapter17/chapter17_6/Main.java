package chapter17_6;

import static java.lang.System.*;

import java.io.FileWriter;

// 変数fwのスコープを広げるとエラー
public class Main {
    public static void main(String[] args) {
        FileWriter fw = new FileWriter("data.txt");
        try {
            fw.write("Hello");
        } catch (Exception e) {
            out.println("何らかの例外が発生しました");
        } finally {
            fw.close();
        }
    }
}
