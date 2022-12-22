package GenericEx;

interface A {
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("메소드 내용 1");
	}
}

public class BeforeGeneric {
	public static void main(String[] args) {
//		 1. 일반적인 메소드 사용법
		A a1 = new B();
		a1.abc();
//		2. 익명의 이너클래스 사용법, 클래스 B 전체를 주석 처리 후 실행
		A a2 = new A() {
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		a2.abc();

		A a3 = () -> System.out.println("메서드 내용 3");

		a3.abc();
	}
}
