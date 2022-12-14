package innerClassEx;

class OuterA1 {
	int a = 3;
	static int b = 4;

	void method1() {
		System.out.println("instance method");
	}

	static void method2() {
		System.out.println("static method");
	}

	static class InnerB1 {

		void bcd() {
			System.out.println(b);

			method2();
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
		OuterA1.InnerB1 b = new OuterA1.InnerB1();
		b.bcd();
	}
}
