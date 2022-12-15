package exceptionEx;

import java.io.IOException;

public class ThrowsTest {
	public static void main(String[] args) throws IOException {
		byte[] a = { 'a', 'b', 'c' };
		System.out.println(a);
		System.out.printf("%c %c %c\n", a[0], a[1], a[2]);

		System.out.write(a);
	}
}
