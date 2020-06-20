package chapter4;

public class rensyu4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {3, 4, 9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i : numbers) {
			if (i == input) {
				System.out.println("アタリ！");
			}
		}
	}

}
