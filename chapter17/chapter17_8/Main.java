package chapter17_8;

import static java.lang.System.*;

import java.io.FileWriter;
import java.io.IOException;

// 後片付け処理もtry-catchする
public class Main {
    public static void main(String[] args) {
        FileWriter fw =null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("Hello");
        } catch (Exception e) {
            out.println("何らかの例外が発生しました");
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                ;
            }
        }
    }
}
