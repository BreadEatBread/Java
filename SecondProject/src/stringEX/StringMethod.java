package stringEX;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String indata;
		while (true) {
			System.out.print("�ֹε�Ϲ�ȣ(13�ڸ�) �Է�(����� x): ");
			indata = sc.next();
			int month = Integer.parseInt(indata.substring(2, 4));
			int sex = Integer.parseInt(indata.substring(6, 7));
			if (indata.equals("x"))
				break;
			if (indata.length() != 13) {
				System.out.println("�Է�����: �ֹε�Ϲ�ȣ�� 13�ڸ� �Դϴ�!");
			} else if (month >= 12 || month == 0) {
				System.out.println("�� �Է����� : ������� 1~12�� �����Դϴ�!");
			} else {
				System.out.println("�Է��� �ֹε�Ϲ�ȣ :" + indata.substring(0, 6) + "-" + indata.substring(6, 13));
				if (sex % 2 == 0) {
					System.out.println("�����Դϴ�!");
				} else {
					System.out.println("�����Դϴ�!");
				}
			}
			sc.nextLine();
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�!");
	}
}
