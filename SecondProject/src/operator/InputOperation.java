package operator;

import java.util.Scanner;

public class InputOperation {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++");
		System.out.println("+ 점수 게산 프로그램+");
		System.out.println("+   개발자: 김정웅  +");
		System.out.println("+    버 전: 1.0     +");
		System.out.println("+++++++++++++++++++++");

		Scanner scan = new Scanner(System.in);

		double korScore, engScore, mathScore, totalScore, scienceScore;
		double avgScore;

		System.out.print("국어 성적 : ");
		korScore = scan.nextDouble();
		System.out.print("영어 성적 : ");
		engScore = scan.nextDouble();
		System.out.print("수학 성적 : ");
		mathScore = scan.nextDouble();
		System.out.print("과학 성적 : ");
		scienceScore = scan.nextDouble();
		scan.close();

		totalScore = korScore + engScore + mathScore + scienceScore;
		avgScore = totalScore / 4;

		String outputMessage;

		System.out.println("총점: " + totalScore);
		System.out.printf("평균: %.1f", avgScore);
		System.out.println("");

		outputMessage = avgScore >= 90 ? "우승생입니다." : "수고하셨습니다.";
		System.out.println(outputMessage);

		System.out.println("프로그램을 이용해 주셔서 감사합니다.");
	}
}
