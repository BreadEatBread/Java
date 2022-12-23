package lambdaEx;

interface A2 {
	B2 abc();
}

interface A3 {
	B2 abc(int k);
}

class B2 {
	B2() {
		System.out.println("첫번째 생성자");
	}

	B2(int k) {
		System.out.println("두번째 생성자");
	}
}

public class ClassConstructor {
	public static void main(String[] args) {

		// 익명의 이너클래스
		A2 a1 = new A2() {
			public B2 abc() {
				return new B2();
			}
		};

		// 람다식
		A2 a2 = () -> new B2();

		// 클래스 생성자() 참조
		A2 a3 = B2::new;
		a1.abc();
		a2.abc();
		a3.abc();

//		클래스 생성자(매개변수) 참조
		A3 a4 = B2::new;
		a4.abc(0);
	}
}
