package arrayEx;

import java.util.Scanner;

public class ArrayName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];

		for (int i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "��° �л� �̸� �Է�: ");
			name[i] = sc.next();
		}
		System.out.println("�̸� �Է��� �Ϸ� �Ǿ����ϴ�!!");
		sc.close();
		for (int j = 0; j < name.length; j++) {
			System.out.println(j + 1 + "��° �л� �̸� :" + name[j]);
		}
		System.out.println("+++ ���α׷��� �����մϴ�! +++");
	}
}
