package chapter15_rensyu2;

// 要やり直し
public class Main {
    public String concatPath(String folder, String file) {
        if (!folder.endsWith("¥¥")) {
            folder += "¥¥";
        }
        return folder + file;
    }
}
