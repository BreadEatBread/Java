package operator;

import java.util.Scanner;

public class InputOperation {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++");
		System.out.println("+ ���� �Ի� ���α׷�+");
		System.out.println("+   ������: ������  +");
		System.out.println("+    �� ��: 1.0     +");
		System.out.println("+++++++++++++++++++++");

		Scanner scan = new Scanner(System.in);

		double korScore, engScore, mathScore, totalScore, scienceScore;
		double avgScore;

		System.out.print("���� ���� : ");
		korScore = scan.nextDouble();
		System.out.print("���� ���� : ");
		engScore = scan.nextDouble();
		System.out.print("���� ���� : ");
		mathScore = scan.nextDouble();
		System.out.print("���� ���� : ");
		scienceScore = scan.nextDouble();
		scan.close();

		totalScore = korScore + engScore + mathScore + scienceScore;
		avgScore = totalScore / 4;

		String outputMessage;

		System.out.println("����: " + totalScore);
		System.out.printf("���: %.1f", avgScore);
		System.out.println("");

		outputMessage = avgScore >= 90 ? "��»��Դϴ�." : "�����ϼ̽��ϴ�.";
		System.out.println(outputMessage);

		System.out.println("���α׷��� �̿��� �ּż� �����մϴ�.");
	}
}
