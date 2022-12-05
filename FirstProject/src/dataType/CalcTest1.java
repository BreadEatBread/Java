package dataType;

import java.util.Scanner;

public class CalcTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum1, iNum2;
		System.out.print("첫 번째 정수 입력");
		iNum1 = sc.nextInt();
		System.out.print("두 번째 정수 입력");
		iNum2 = sc.nextInt();
		sc.close();
		System.out.printf("1. %d/%d = %.2f\n", iNum1, iNum2, (float) iNum1 / iNum2);
		System.out.printf("2. %d/%d = %.2f\n", iNum1, iNum2, iNum1 / (float) iNum2);
		System.out.printf("3. %d/%d = %.2f\n", iNum1, iNum2, (float) (iNum1 / iNum2));
		System.out.printf("4. %d/%d = %.2f\n", iNum1, iNum2, iNum1 / iNum2);
	}
}
