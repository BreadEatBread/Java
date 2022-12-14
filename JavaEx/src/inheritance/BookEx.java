package inheritance;

import externalEx.ProgramInfo;

public class BookEx {
	public static void main(String[] args) {
		ProgramInfo.print("Super() 실습", "김정웅", 1.0);
		EnglishBook eb = new EnglishBook("성문종합영어", 25000);
		eb.printPrice();
	}
}
