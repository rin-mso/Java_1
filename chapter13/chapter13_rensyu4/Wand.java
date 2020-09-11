package chapter13_rensyu4;

// getter、setterメソッドの妥当性検証の追加
public class Wand {
    private String name;    // 杖の名前
    private double power;   // 杖の魔力

    public String getName() {
    return this.name;
    }
    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException
                ("杖に設定する名前は３文字以上で設定してください。");
        }
        this.name = name;
    }

    public double getPower() {
        return this.power;
    }
    public void setPower(double power) {
        if (power < 0.5 || 100 < power) {
            throw new IllegalArgumentException
            ("杖に設定する増幅率は５以上、１００以下で設定してください。");
        }
        this.power = power;
    }
}
