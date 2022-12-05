package dataType;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Gugudan {
	public static void main(String[] args) {
		int dan = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("출력할 단을 입력하세요: ");
		try {
			dan = sc.nextInt();
		} catch (InputMismatchException e) {
//			System.out.println(e);
			System.out.println("입력 오류,,, 정수 만 입력하세요!!");
		} finally {
			sc.close();
		}
		if (dan >= 10 || dan <= 1) {
			System.out.println("2 ~ 9단까지 만 이용하세요!");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.printf(dan + " x " + i + " = " + "%2d", dan * i);
				System.out.println(" ");
			}
		}
	}
}
