package chapter15_rensyu4;

import static java.lang.System.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // ①現在時刻を取得
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        // ②日時情報をCalendarにセット
        c.setTime(now);
        // ③Calendarから「日」の数値を取得
        int day = c.get(Calendar.DAY_OF_MONTH);
        // ④取得した値に100を足した値をCalendarの「日」にセット
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        // ⑤Calendarの日時情報をDate型に変換
        Date after = c.getTime();
        // ⑥指定された形式でDateインスタンスの内容を表示
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        out.println(f.format(after));
    }
}
