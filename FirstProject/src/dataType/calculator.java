package dataType;

import java.util.Scanner;
import java.util.InputMismatchException;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char oper;
		double result;
		String input;
		while (true) {
			num1 = 0;
			num2 = 0;
			result = 0;
			System.out.print("연산자를 입력하세요('+, -, *, /' 종료 시 'x' 입력): ");
			input = sc.next();
			oper = input.charAt(0);
			if (oper == 'x')
				break;
			try {
				System.out.print("첫번째 수를 입력하세요: ");
				num1 = sc.nextInt();
				System.out.print("두번째 수를 입력하세요: ");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("입력 오류,,, 정수 만 입력하세요!!");
				break;
			} finally {
				sc.close();
			}
			switch (oper) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = (double) num1 / (double) num2;
				break;
			}
			System.out.printf("%d %s %d = %.2f\n", num1, oper, num2, result);
		}
		System.out.println("*** 프로그램을 종료합니다 ***");
	}
}
