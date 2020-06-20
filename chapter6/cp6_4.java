package chapter6;

// Calcクラス
public class cp6_4 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 2;
		int total = cp6_2.tasu(a, b);	// tasuメソッドが存在するクラスを指定して呼び出す
		int delta = cp6_2.hiku(a, b);	// hikuメソッドが存在するクラスを指定して呼び出す
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
