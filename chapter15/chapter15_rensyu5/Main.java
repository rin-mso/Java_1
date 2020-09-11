package chapter15_rensyu5;

import static java.lang.System.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate after = now.plusDays(100);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        out.println(after.format(fmt));
    }
 }
