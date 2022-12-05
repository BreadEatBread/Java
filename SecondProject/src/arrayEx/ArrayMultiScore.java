package arrayEx;

import java.util.Scanner;

public class ArrayMultiScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][2];
		int total[] = new int[2];

		for (int i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "번째 학생 이름 입력: ");
			name[i] = sc.next();
			System.out.print("영어 점수 입력: ");
			score[i][0] = sc.nextInt();
			total[0] += score[i][0];
			System.out.print("자바 점수 입력: ");
			score[i][1] = sc.nextInt();
			total[1] += score[i][1];
		}
		double avg[] = new double[2];
		avg[0] += (double)total[0]/name.length;
		avg[1] += (double)total[1]/name.length;
		sc.close();
		System.out.println("입력이 완료 되었습니다!!");
		System.out.println("++++ 학생 별 점수 ++++");
		System.out.println("                  영어  자바");
		for (int j = 0; j < name.length; j++) {
			System.out.printf("%-8s : %5d %5d \n", name[j], score[j][0], score[j][1]);
		}
		for(int i = 0; i < score[0].length; i++) {
		System.out.printf("총점       :  %5d %5d", total[0], total[1]);
		}
		System.out.printf("평균       :    %.1f  %.1f\n", avg[0], avg[1]);
		System.out.println("+++ 프로그램을 종료합니다!! +++");
	}
}
