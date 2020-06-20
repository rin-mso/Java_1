package chapter9;

public class Hero {
	String name;
	int hp;
	Sword sword;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に５ポイントのダメージをあたえた！");
	}

	// コード9-9
//	public Hero() {
//		this.hp = 100;		// hpフィールドを100で初期化
//	}

	// コード9-10
//	public Hero(String name) {
//		this.hp = 100;
//		this.name = name;		// 引数の値でnameフィールドを初期化
//	}

	// コード9-12
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}
}
