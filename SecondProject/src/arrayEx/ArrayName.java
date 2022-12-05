package arrayEx;

import java.util.Scanner;

public class ArrayName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];

		for (int i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "번째 학생 이름 입력: ");
			name[i] = sc.next();
		}
		System.out.println("이름 입력이 완료 되었습니다!!");
		sc.close();
		for (int j = 0; j < name.length; j++) {
			System.out.println(j + 1 + "번째 학생 이름 :" + name[j]);
		}
		System.out.println("+++ 프로그램을 종료합니다! +++");
	}
}
