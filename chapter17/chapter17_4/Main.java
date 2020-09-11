package chapter17_4;

import static java.lang.System.*;

import java.io.FileWriter;
import java.io.IOException;

// try-catchのあとでcloseするとエラー
public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("Hello");
        } catch (IOException e) {
            out.println("エラーです");
        }
        fw.close();
    }
}
