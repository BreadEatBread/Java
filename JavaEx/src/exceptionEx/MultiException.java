package exceptionEx;

public class MultiException {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 3);
			int a = Integer.parseInt("20A");
		} catch (ArithmeticException ae) {
			System.out.println("0���� ������ �����ϴ�.");
		} catch (NumberFormatException nfe) {
			System.out.println("������ ����ȯ�� ���ڸ� �����մϴ�.");
		} finally {
			System.out.println("���α׷��� �����մϴ�..");
		}
	}
}
