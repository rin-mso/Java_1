package chapter15_5;

public class Main {
    public boolean isValidPlayerName(String name) {
        if (name.length() != 8) {
            return false;
        }
        char first = name.charAt(0);
        // 最初の1文字はA〜Z
        if (!(first >= 'A' && first <= 'Z')) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            char c = name.charAt(i);
            // 以降の文字はA〜Zか0〜9
            if (!((c >= 'A' && 'c' <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        return true;
    }
}
