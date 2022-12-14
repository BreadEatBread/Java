package innerClassEx;

class OuterA {
	int a = 3;
	int b = 4;

	void abc() {
		System.out.println("A 클래스 메서드");
	}

	class InnerB {
		int a = 5;
		int b = 6;

		void abc() {
			System.out.println("B 클래스 메서드");
		}

		void bcd() {
			System.out.println(a);
			System.out.println(b);
			abc();

			System.out.println(OuterA.this.a);
			System.out.println(OuterA.this.b);
			OuterA.this.abc();
		}
	}
}

public class InstanceInnerClass {
	public static void main(String[] args) {
		OuterA a = new OuterA();

		OuterA.InnerB b = a.new InnerB();
		b.bcd();
	}
}
