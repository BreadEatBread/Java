package interfaceEx;
interface A {
	default void abc() {
		System.out.println("A �������̽��� abc()");
	}
}
public class B implements A {
	public void abc() {
		A.super.abc();
		System.out.println("BŬ������ abc()");
	}
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}
