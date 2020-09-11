package chapter14_7;

// 名前が同じなら同じ勇者とするequals()を定義
public class Hero {
    String name;
    int hp;
    /* ... */
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o instanceof Hero) {
            Hero h = (Hero)o;
            if (this.name.equals(h.name)) {
                return true;
            }
        }
        return false;
    }
}
