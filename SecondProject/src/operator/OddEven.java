package operator;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++");
		System.out.println("+   ���� �Ի� ���α׷�   +");
		System.out.println("+     ������: ������    +");
		System.out.println("+     �� ��: 1.0     +");
		System.out.println("+++++++++++++++++++++");
		Scanner scan = new Scanner(System.in);
		String inputNum;
		int num;
		String outputMessage;
		System.out.print("���� �Է�: ");
		inputNum = scan.nextLine();
		scan.close();
		num = Integer.parseInt(inputNum);
//		outputMessage = num % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";

		if (num % 2 == 0) {
			outputMessage = "¦���Դϴ�.";
		} else {
			outputMessage = "Ȧ���Դϴ�.";
		}
		System.out.println(outputMessage);
		System.out.println("���α׷��� �̿��� �ּż� �����մϴ�!");
	}
}
