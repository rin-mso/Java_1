package chapter18_1;

import static java.lang.System.*;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data.txt");
        int input = fr.read();
        while (input != -1) {
            out.println((char)input);
            input = fr.read();
        }
        fr.close();
    }
}
