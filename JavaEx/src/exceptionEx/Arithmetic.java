package exceptionEx;

public class Arithmetic {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램을 종료 합니다.");		
	}
}
