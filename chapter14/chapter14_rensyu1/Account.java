package chapter14_rensyu1;

public class Account {
    String accountNumber;
    int balance;

    // ①の条件
    public String toString() {
        return "¥¥" + this.balance + "(口座番号＝" + this.accountNumber + ")";
    }

    // ②の条件
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Account) {
            Account a = (Account)o;
            String an1 = this.accountNumber.trim();
            String an2 = a.accountNumber.trim();
            if (an1.equals(an2)) {
                return true;
            }
        }
        return false;
    }
}
