package loopEx;

import java.util.Scanner;

public class AddLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sumOdd = 0, sumEven = 0, threesum = 0;
		while (true) {
			sumOdd = 0;
			sumEven = 0;
			threesum = 0;
			System.out.print("�󸶱��� ������ ������ �Է��ϼ���(0 �Է½� ����): ");
			num = scan.nextInt();
			if (num == 0)
				break;
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0)
					sumOdd += i;
				if (i % 2 != 0)
					sumEven += i;
				if (i % 3 == 0)
					threesum += i;
			}
			System.out.printf("1���� %d���� ¦���� ���� %d�Դϴ�.\n", num, sumOdd);
			System.out.printf("1���� %d���� Ȧ���� ���� %d�Դϴ�.\n", num, sumEven);
			System.out.printf("1���� %d���� 3�� ����� ���� %d�Դϴ�.\n", num, threesum);
		}
		scan.close();
		System.out.println("*** ���α׷��� �����մϴ�. ***");
	}
}
