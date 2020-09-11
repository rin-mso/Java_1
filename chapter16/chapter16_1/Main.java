package chapter16_1;

import static java.lang.System.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(10);
        points.add(80);
        points.add(75);
        for (int i : points) {
            out.println(i);
        }
    }
}
