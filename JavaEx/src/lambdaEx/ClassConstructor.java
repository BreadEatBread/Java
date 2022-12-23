package lambdaEx;

interface A2 {
	B2 abc();
}

interface A3 {
	B2 abc(int k);
}

class B2 {
	B2() {
		System.out.println("ù��° ������");
	}

	B2(int k) {
		System.out.println("�ι�° ������");
	}
}

public class ClassConstructor {
	public static void main(String[] args) {

		// �͸��� �̳�Ŭ����
		A2 a1 = new A2() {
			public B2 abc() {
				return new B2();
			}
		};

		// ���ٽ�
		A2 a2 = () -> new B2();

		// Ŭ���� ������() ����
		A2 a3 = B2::new;
		a1.abc();
		a2.abc();
		a3.abc();

//		Ŭ���� ������(�Ű�����) ����
		A3 a4 = B2::new;
		a4.abc(0);
	}
}
