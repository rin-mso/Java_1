package chapter17_7;

import static java.lang.System.*;

import java.io.FileWriter;

// tryブロック内でnewするとエラー
public class Main {
    public static void main(String[] args) {
        FileWriter fw;
        try {
            fw = new FileWriter("data.txt");
            fw.write("Hello");
        } catch (Exception e) {
            out.println("何らかの例外が発生しました");
        } finally {
            fw.close();
        }
    }
}
