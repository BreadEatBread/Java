package operator;

import java.util.Scanner;

public class RideCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double height, weight;
		System.out.print("키 입력(cm): ");
		height = scan.nextDouble();
		System.out.print("몸무게 입력(kg): ");
		weight = scan.nextDouble();
		scan.close();

//		if (height > 190 || weight > 120) {
//			System.out.println("키가 190cm가 넘어가거나 몸무게가 125kg이 넘어 놀이기구를 탈 수 없습니다.");
//		} else {
//			System.out.println("어서오세요, 즐거운 시간되세요!!!");
//		}

		if (height > 190) {
			System.out.println("키가 190가 넘어 놀이기구를 탈 수 없습니다.");
		} else {
			if (weight > 120)
				System.out.println("몸무게가 120kg이 넘어 이 놀이기구를 탈 수 없습니다.");
			else
				System.out.println("어서오세요, 즐거운 시간되세요!!");
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
