package chapter17_rensyu1;

import static java.lang.System.*;

// nullPointerExceptionを発生させる
public class Main {
    public static void main(String[] args) {
        String s = null;
        out.println(s.length());
    }
}
