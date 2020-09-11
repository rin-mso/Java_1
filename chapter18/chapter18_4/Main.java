package chapter18_4;

import java.sql.Connection;
import java.sql.DriverManager;

// DBに接続してSQLを送信する
public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        String dburl = "jrdc:h2:~/test";    // 接続先DBを指定
        String sql = "INSERT INTO EMPLPOYEES(name) VALUES('aoki')";
        Connection conn = DriverManager.getConnection(dburl);   // DBに接続
        conn.createStatement().executeUpdate(sql);  // SQLを送信
        conn.close();   // DB接続を閉じる
    }
}
