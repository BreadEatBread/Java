package innerClassEx;

class OuterA3 {
	C1 c = new C1() {
		public void bcd() {
			System.out.println("�͸� �̳� Ŭ����");
		}
	};

	void abc() {
		c.bcd();
	}
}

interface C1 {
	public abstract void bcd();
}

public class AnonymousClass {
	public static void main(String[] args) {
		OuterA3 a = new OuterA3();
		a.abc();
	}
}
