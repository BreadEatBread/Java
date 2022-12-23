package lambdaEx;

interface A {
	void abc();
}

class B {
	static void bcd() { // static void로 선언할 시 정적인 메소드로 변환됨
		System.out.println("메소드");
	}
}

public class InstanceMethod {
	public static void main(String[] args) {
//		1. 익명의 이너클래스
		A a1 = new A() {
			@Override
			public void abc() {
//				B b = new B();
//				b.bcd();
				B.bcd();
			}
		};
//		2. 람다식
		A a2 = () -> {
//			B b = new B();
//			b.bcd();
			B.bcd();
		};
//		3. 정의된 메소드 참조
//		B b = new B();
//		A a3 = b::bcd;
		a1.abc();
		a2.abc();
//		a3.abc();
	}
}
