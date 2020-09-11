package chapter17_rensyu2;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        String s = null;
        try {
            out.println(s.length());
        } catch (Exception e) {
            out.println("NullPointerException例外をcatchしました");
            out.println("ーースタックトレース（ここから）ーー");
            e.printStackTrace();
            out.println("ーースタックトレース（ここまで）ーー");
        }
    }
}
