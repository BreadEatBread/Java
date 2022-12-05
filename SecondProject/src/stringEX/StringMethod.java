package stringEX;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String indata;
		while (true) {
			System.out.print("주민등록번호(13자리) 입력(종료시 x): ");
			indata = sc.next();
			int month = Integer.parseInt(indata.substring(2, 4));
			int sex = Integer.parseInt(indata.substring(6, 7));
			if (indata.equals("x"))
				break;
			if (indata.length() != 13) {
				System.out.println("입력착오: 주민등록번호는 13자리 입니다!");
			} else if (month >= 12 || month == 0) {
				System.out.println("월 입력착오 : 생년월은 1~12월 사이입니다!");
			} else {
				System.out.println("입력한 주민등록번호 :" + indata.substring(0, 6) + "-" + indata.substring(6, 13));
				if (sex % 2 == 0) {
					System.out.println("여성입니다!");
				} else {
					System.out.println("남성입니다!");
				}
			}
			sc.nextLine();
		}
		sc.close();
		System.out.println("프로그램을 종료합니다!");
	}
}
