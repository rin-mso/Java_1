package chapter5;

public class rensyu5_3 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title = "○○の件について";
		String address = "xxxxx@xxx.co.jp";
		String text = "お世話になっております。";
		email(address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	// オーバーロード
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
}
