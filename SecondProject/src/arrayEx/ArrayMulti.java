package arrayEx;

import java.util.Scanner;

public class ArrayMulti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] name = new String[5][2];

		for (int i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "��° �л� �̸� �Է�: ");
			name[i][0] = sc.next();
			System.out.print("ID �Է�: ");
			name[i][1] = sc.next();
		}
		sc.close();
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�!!");
		for(int j = 0; j < name.length; j++) {
			System.out.printf(j + 1 + "��° �л�: %-10s %-10s \n",name[j][0],name[j][1]);			
		}
		System.out.println("+++ ���α׷��� �����մϴ�!! +++");
	}
}
