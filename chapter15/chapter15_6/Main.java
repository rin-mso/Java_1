package chapter15_6;

// 文字列パターンを用いたプレイヤー名のチェック
public class Main {
    public boolean isValidPlayerName(String name) {
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
}
