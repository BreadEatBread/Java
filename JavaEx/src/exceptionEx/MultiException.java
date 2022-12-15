package exceptionEx;

public class MultiException {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 3);
			int a = Integer.parseInt("20A");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (NumberFormatException nfe) {
			System.out.println("정수로 형변환은 숫자만 가능합니다.");
		} finally {
			System.out.println("프로그램을 종료합니다..");
		}
	}
}
