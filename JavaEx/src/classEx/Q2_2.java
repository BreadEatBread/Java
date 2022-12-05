package classEx;

class B {
	int m;

	void method() {
		System.out.println("B의 메서드");
	}
}

public class Q2_2 {
	public static void main(String[] args) {
		B b = new B();

		b.m = 5;

		System.out.println(b.m);
		b.method();
	}
}
