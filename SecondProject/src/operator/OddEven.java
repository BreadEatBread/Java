package operator;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++");
		System.out.println("+   점수 게산 프로그램   +");
		System.out.println("+     개발자: 김정웅    +");
		System.out.println("+     버 전: 1.0     +");
		System.out.println("+++++++++++++++++++++");
		Scanner scan = new Scanner(System.in);
		String inputNum;
		int num;
		String outputMessage;
		System.out.print("정수 입력: ");
		inputNum = scan.nextLine();
		scan.close();
		num = Integer.parseInt(inputNum);
//		outputMessage = num % 2 == 0 ? "짝수입니다." : "홀수입니다.";

		if (num % 2 == 0) {
			outputMessage = "짝수입니다.";
		} else {
			outputMessage = "홀수입니다.";
		}
		System.out.println(outputMessage);
		System.out.println("프로그램을 이용해 주셔서 감사합니다!");
	}
}
