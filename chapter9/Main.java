package chapter9;

// コード9-1
//public class Main {
//	public static void main(String[] args) {
//		Hero h;
//		h = new Hero();
//		h.hp = 100;
//	}
//}

// コード9-2〜
//public class Main {
//	public static void main(String[] args) {
//		Hero h1;
//		h1 = new Hero();
//		h1.hp = 100;
//		Hero h2;
//		h2 = h1;
//		h2.hp = 200;
//		System.out.println(h1.hp);
//	}
//}

// コード9-4
//public class Main {
//	public static void main(String[] args) {
//		Sword s = new Sword();
//		s.name = "炎の剣";
//		s.damage = 10;
//		Hero h = new Hero();
//		h.name = "ミナト";
//		h.hp = 100;
//		h.sword = s;
//		System.out.println("現在の武器は" + h.sword.name);
//	}
//}

// コード9-5
//public class Main {
//	public static void main(String[] args) {
//		Hero h1 = new Hero();
//		h1.name = "ミナト";
//		h1.hp = 100;
//		Hero h2 = new Hero();
//		h2.name = "アサカ";
//		h2.hp = 100;
//		Wizard w = new Wizard();
//		w.name = "スガワラ";
//		w.hp = 50;
//		w.heal(h1);		// ミナトを回復させる
//		w.heal(h2); 	// アサカを回復させる
//		w.heal(h2); 	// アサカを回復させる
//	}
//}

// コード9-9
//public class Main {
//	public static void main(String[] args) {
//		Hero h = new Hero();
//		System.out.println(h.hp);
//	}

	//コード9-11
//	public class Main {
//		public static void main(String[] args) {
//			Hero h = new Hero("ミナト");
//			System.out.println(h.hp);
//			System.out.println(h.name);
//		}
//}

	// コード9-13
	public class Main {
		public static void main(String[] args) {
			Hero h1 = new Hero("ミナト");
			System.out.println(h1.name);
			Hero h2 = new Hero();
			System.out.println(h2.name);
		}
	}
