package chapter17_9;

import static java.lang.System.*;

import java.io.FileWriter;
import java.io.IOException;

// ファイルを開いたときだけ後片付けする
public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("Hello");
        } catch (Exception e) {
            out.println("何らかの例外が発生しました");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    ;
                }
            }
        }
    }
}
