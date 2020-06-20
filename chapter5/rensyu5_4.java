package chapter5;

public class rensyu5_4 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double triangleAria = calcTriangleAria(12.5, 10.5);
		System.out.println("三角形の面積は" + triangleAria + "平方cm");
		double circleAria = calcCircleAria(13.8);
		System.out.println("円の面積は" + circleAria + "平方cm");
	}
	public static double calcTriangleAria(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	public static double calcCircleAria(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
