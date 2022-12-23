package lambdaEx;

interface C {
	int abc(String str);
}

public class InstanceMethod2 {
	public static void main(String[] args) {
//		�͸��� �̳�Ŭ����
		C a1 = new C() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};

		C a2 = (String str) -> str.length();

		C a3 = String::length;

		System.out.println(a1.abc("�ȳ��ϼ���"));
		System.out.println(a2.abc("�ȳ��ϼ���"));
		System.out.println(a3.abc("�ȳ��ϼ���"));
	}
}
