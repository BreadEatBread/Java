package select;

import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int floor;
		String info;

		System.out.print("���� �Է�(1~5): ");
		floor = scan.nextInt();
		scan.close();

//		if (floor == 1)
//			info = "�౹";
//		else if (floor == 2)
//			info = "�����ܰ�";
//		else if (floor == 3)
//			info = "�Ǻΰ�";
//		else if (floor == 4)
//			info = "ġ��";
//		else if (floor == 5)
//			info = "�ｺŬ��";
//		else
//			info = "�����Է�";

		switch (floor) {
		case 1:
			info = "�౹";
			break;
		case 2:
			info = "�����ܰ�";
			break;
		case 3:
			info = "�Ǻΰ�";
			break;
		case 4:
			info = "ġ��";
			break;
		case 5:
			info = "�ｺŬ��";
			break;
		default:
			info = "�����Է�";
		}
		System.out.println(floor + "�� " + info + " �Դϴ�.");
		System.out.println("*** ���α׷��� �����մϴ�. ***");
	}
}
