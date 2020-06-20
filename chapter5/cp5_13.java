package chapter5;

public class cp5_13 {
	// int型配列を受け取り、配列内の要素全てに１を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = {1, 2, 3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
