package chapter17_3;

import static java.lang.System.*;

import java.io.FileWriter;

// ざっくりと例外を捕捉
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello");
            fw.close();
        } catch (Exception e) {
            out.println("何らかの例外が発生しました。");
        }
    }
}
