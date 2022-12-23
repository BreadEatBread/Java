package lambdaEx;

interface A {
	void abc();
}

class B {
	static void bcd() { // static void�� ������ �� ������ �޼ҵ�� ��ȯ��
		System.out.println("�޼ҵ�");
	}
}

public class InstanceMethod {
	public static void main(String[] args) {
//		1. �͸��� �̳�Ŭ����
		A a1 = new A() {
			@Override
			public void abc() {
//				B b = new B();
//				b.bcd();
				B.bcd();
			}
		};
//		2. ���ٽ�
		A a2 = () -> {
//			B b = new B();
//			b.bcd();
			B.bcd();
		};
//		3. ���ǵ� �޼ҵ� ����
//		B b = new B();
//		A a3 = b::bcd;
		a1.abc();
		a2.abc();
//		a3.abc();
	}
}
