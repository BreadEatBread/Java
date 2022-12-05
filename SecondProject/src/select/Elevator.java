package select;

import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int floor;
		String info;

		System.out.print("층수 입력(1~5): ");
		floor = scan.nextInt();
		scan.close();

//		if (floor == 1)
//			info = "약국";
//		else if (floor == 2)
//			info = "정형외과";
//		else if (floor == 3)
//			info = "피부과";
//		else if (floor == 4)
//			info = "치과";
//		else if (floor == 5)
//			info = "헬스클럽";
//		else
//			info = "착오입력";

		switch (floor) {
		case 1:
			info = "약국";
			break;
		case 2:
			info = "정형외과";
			break;
		case 3:
			info = "피부과";
			break;
		case 4:
			info = "치과";
			break;
		case 5:
			info = "헬스클럽";
			break;
		default:
			info = "착오입력";
		}
		System.out.println(floor + "층 " + info + " 입니다.");
		System.out.println("*** 프로그램을 종료합니다. ***");
	}
}
