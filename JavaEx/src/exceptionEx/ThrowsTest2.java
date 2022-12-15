package exceptionEx;

import java.io.IOException;

class A {
	void abc() throws IOException {
		bcd();
	}
	void bcd() throws IOException {
		byte[] a = { 'a', 'b', 'c' };
		System.out.println(a);
		System.out.printf("%c %c %c\n", a[0], a[1], a[2]);
		System.out.write(a);
	}
}

public class ThrowsTest2 {
	public static void main(String[] args) throws IOException {
		A a = new A();
		a.abc();
	}
}
