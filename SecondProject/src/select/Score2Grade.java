package select;

import java.util.Scanner;

public class Score2Grade {
	public static void main(String[] args) {
		int score;
		String grade = " ";
		Scanner scan = new Scanner(System.in);
		System.out.print("점수(정수로 0~100) 입력 하세요: ");
		score = scan.nextInt();
		scan.close();
//		if (score >= 90)
//			grade = 'A';
//		else if (score >= 80)
//			grade = 'B';
//		else if (score >= 70)
//			grade = 'C';
//		else if (score >= 60)
//			grade = 'D';
//		else
//			grade = 'F';
		
		switch (score / 5) {
		case 20:
		case 19:
			grade = "A+";
			break;
		case 18:
			grade = "A";
			break;
		case 17:
			grade = "B+";
			break;
		case 16:
			grade = "B";
			break;
		case 15:
			grade = "C+";
			break;
		case 14:
			grade = "C";
			break;
		case 13:
			grade = "D+";
			break;
		case 12:
			grade = "D";
			break;
		default:
			grade = "F";

		}
		System.out.println(score + "점은 " + grade + " 입니다.");
	}
}
