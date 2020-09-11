package chapter17_5;

import static java.lang.System.*;

import java.io.FileWriter;

// finallyブロックでcloseするとエラー
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello");
        } catch (Exception e) {
            out.println("何らかの例外が発生しました");
        } finally {
            fw.close();
        }
    }
}
