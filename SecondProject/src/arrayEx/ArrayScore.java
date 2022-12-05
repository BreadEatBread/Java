package arrayEx;

import java.util.Scanner;

public class ArrayScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];
		int[] score = new int[5];
		int total = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 학생 이름 입력: ");
			name[i] = sc.next();
			System.out.print("점수 입력: ");
			score[i] = sc.nextInt();
		}
		System.out.println("입력이 완료 되었습니다!!");
		sc.close();
		System.out.println("++++ 학생 별 점수 ++++");
		for (int j = 0; j < score.length; j++) {
			System.out.println(name[j] + "           : " + score[j]);
			total += score[j];
		}
		double avg = (double) total / score.length;
		System.out.printf("총점: %d\n평균: %.1f\n", total, avg);
		System.out.println("+++ 프로그램을 종료합니다! +++");
	}
}
