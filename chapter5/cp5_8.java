package chapter5;

public class cp5_8 {
	public static int add(int x, int y) {
		int ans = x +y;
		return ans;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(add(add(10, 20), add(30, 40)));
	}
}
