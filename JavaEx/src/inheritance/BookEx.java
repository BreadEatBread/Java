package inheritance;

import externalEx.ProgramInfo;

public class BookEx {
	public static void main(String[] args) {
		ProgramInfo.print("Super() �ǽ�", "������", 1.0);
		EnglishBook eb = new EnglishBook("�������տ���", 25000);
		eb.printPrice();
	}
}
