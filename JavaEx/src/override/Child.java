package override;

class GrandFather {
	void move() {
		System.out.println("지팡이가 필요해!");
	}
}

class Father extends GrandFather {
	void move() {
		System.out.println("빠르게 걸을 수 있지요!");
	}
}

public class Child extends Father {
	void move() {
		System.out.println("엉금엉금 기어요...");
	}

	public static void main(String[] args) {
		GrandFather f1 = new GrandFather();
		Father f2 = new Child();
		f1.move();
		f2.move();
	}
}
