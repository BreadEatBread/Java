package GenericEx;

interface A {
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("�޼ҵ� ���� 1");
	}
}

public class BeforeGeneric {
	public static void main(String[] args) {
//		 1. �Ϲ����� �޼ҵ� ����
		A a1 = new B();
		a1.abc();
//		2. �͸��� �̳�Ŭ���� ����, Ŭ���� B ��ü�� �ּ� ó�� �� ����
		A a2 = new A() {
			public void abc() {
				System.out.println("�޼��� ���� 2");
			}
		};
		a2.abc();

		A a3 = () -> System.out.println("�޼��� ���� 3");

		a3.abc();
	}
}
