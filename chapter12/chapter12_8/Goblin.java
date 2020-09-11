package chapter12_8;

public class Goblin {
    int hp;
    final int LEVEL = 10;
    char suffix;

    public void run() {
        System.out.println("ゴブリン" + this.suffix + "は逃げ出した！");
    }
}