package innerClassEx;

class OuterA2 {
	int a = 3;

	void abc() {
		int b = 5;
		class InnerB2 {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;

			}
		}
		InnerB2 bb = new InnerB2();
		bb.bcd();

	}
}

public class LocalInnerClass {
	public static void main(String[] args) {
		OuterA2 a = new OuterA2();
		a.abc();
	}
}