package interfaceEx;
interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}
public class B implements A {
	public void abc() {
		A.super.abc();
		System.out.println("B클래스의 abc()");
	}
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}
