package chapter17_2;

import static java.lang.System.*;

import java.io.FileWriter;
import java.io.IOException;

// try-catch文で例外の発生に備える
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            /*... */
        } catch (IOException e) {
            out.println("エラーが発生しました。");
        }
    }
}
