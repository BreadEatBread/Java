package dataType;

public class FormatOutput {
	public static void main(String[] args) {
		final double PI = 333.1415926536;
		System.out.printf("%f, %1$+020.10f %n", PI);
		System.out.printf("%f, %1$01.10f %n", PI);
		System.out.printf("%f, %1$010.10f %n", -PI);
	}
}
