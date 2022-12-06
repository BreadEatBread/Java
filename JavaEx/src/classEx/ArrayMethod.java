package classEx;

import java.util.Arrays;

public class ArrayMethod {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 };
		printArray(a);
		printArray(new int[] { 4, 5, 6 });
	}

	public static void printArray(int[] b) {
		System.out.println(Arrays.toString(b));
		System.out.println(b);
	}
}
