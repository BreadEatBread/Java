package operator;

import java.util.Scanner;

public class RideCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double height, weight;
		System.out.print("Ű �Է�(cm): ");
		height = scan.nextDouble();
		System.out.print("������ �Է�(kg): ");
		weight = scan.nextDouble();
		scan.close();

//		if (height > 190 || weight > 120) {
//			System.out.println("Ű�� 190cm�� �Ѿ�ų� �����԰� 125kg�� �Ѿ� ���̱ⱸ�� Ż �� �����ϴ�.");
//		} else {
//			System.out.println("�������, ��ſ� �ð��Ǽ���!!!");
//		}

		if (height > 190) {
			System.out.println("Ű�� 190�� �Ѿ� ���̱ⱸ�� Ż �� �����ϴ�.");
		} else {
			if (weight > 120)
				System.out.println("�����԰� 120kg�� �Ѿ� �� ���̱ⱸ�� Ż �� �����ϴ�.");
			else
				System.out.println("�������, ��ſ� �ð��Ǽ���!!");
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
