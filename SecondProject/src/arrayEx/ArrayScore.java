package arrayEx;

import java.util.Scanner;

public class ArrayScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];
		int[] score = new int[5];
		int total = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "��° �л� �̸� �Է�: ");
			name[i] = sc.next();
			System.out.print("���� �Է�: ");
			score[i] = sc.nextInt();
		}
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�!!");
		sc.close();
		System.out.println("++++ �л� �� ���� ++++");
		for (int j = 0; j < score.length; j++) {
			System.out.println(name[j] + "           : " + score[j]);
			total += score[j];
		}
		double avg = (double) total / score.length;
		System.out.printf("����: %d\n���: %.1f\n", total, avg);
		System.out.println("+++ ���α׷��� �����մϴ�! +++");
	}
}
