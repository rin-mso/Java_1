package chapter17_10;

import static java.lang.System.*;

import java.io.FileWriter;

// try-with-resources文の利用（17-9をすっきり書く形)
public class Main {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.txt");) {
            fw.write("Hello");
        } catch (Exception e) {
            out.println("何らかの例外が発生しました");
        }
    }
}
