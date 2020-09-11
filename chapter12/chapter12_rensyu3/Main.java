package chapter12_rensyu3;

public class Main {
    public static void main(String[] args) {
        Y[] arrayY = new Y[2];
        arrayY[0] = new A();
        arrayY[1] = new B();

        for(Y y : arrayY) {
            y.b();
        }
    }
}
