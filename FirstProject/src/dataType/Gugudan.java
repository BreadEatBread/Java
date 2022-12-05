package dataType;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Gugudan {
	public static void main(String[] args) {
		int dan = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("����� ���� �Է��ϼ���: ");
		try {
			dan = sc.nextInt();
		} catch (InputMismatchException e) {
//			System.out.println(e);
			System.out.println("�Է� ����,,, ���� �� �Է��ϼ���!!");
		} finally {
			sc.close();
		}
		if (dan >= 10 || dan <= 1) {
			System.out.println("2 ~ 9�ܱ��� �� �̿��ϼ���!");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.printf(dan + " x " + i + " = " + "%2d", dan * i);
				System.out.println(" ");
			}
		}
	}
}
