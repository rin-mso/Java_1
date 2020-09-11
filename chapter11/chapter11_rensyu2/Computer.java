package chapter11_rensyu2;

public class Computer extends TangibleAsset{
    String makerName;

    public Computer(String name, int price, String color) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return this.makerName;
    }
}
