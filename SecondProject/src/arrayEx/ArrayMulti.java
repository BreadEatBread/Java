package arrayEx;

import java.util.Scanner;

public class ArrayMulti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] name = new String[5][2];

		for (int i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "번째 학생 이름 입력: ");
			name[i][0] = sc.next();
			System.out.print("ID 입력: ");
			name[i][1] = sc.next();
		}
		sc.close();
		System.out.println("입력이 완료 되었습니다!!");
		for(int j = 0; j < name.length; j++) {
			System.out.printf(j + 1 + "번째 학생: %-10s %-10s \n",name[j][0],name[j][1]);			
		}
		System.out.println("+++ 프로그램을 종료합니다!! +++");
	}
}
