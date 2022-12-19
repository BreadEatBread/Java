package arrayListEx;

import externalEx.ProgramInfo;
import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ProgramInfo.print("ArrayList½Ç½À", "±èÁ¤¿õ", 1.0);
		ArrayList<String> aList1 = new ArrayList<String>();

		aList1.add("ÀÏÁö¸Å");
		aList1.add("È«±æµ¿");
		aList1.add("ÀÏÁö¸Å");

		System.out.println(aList1);

		System.out.println(aList1.get(0));

		int cnt = 0;
		for (int i = 0; i < aList1.size(); i++) {
			if (aList1.get(i) == "±èÁ¤¿õ") {
				cnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		if (cnt == 0)
			System.out.println("ÀÚ·á°¡ ¾ø½À´Ï´Ù.");

		aList1.set(0, "ÀÏÁö¼ø");
		System.out.println(aList1);

		aList1.remove("ÀÏÁö¼ø");
		System.out.println(aList1);

		aList1.add("±èÁ¤¿õ");
		aList1.add("±èÁ¤¿õ");
		System.out.println(aList1);
		aList1.remove("±èÁ¤¿õ");
		
		
		for (int i = 0; i < aList1.size(); i++) {
			if (aList1.get(i) == "±èÁ¤¿õ") {
				cnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		if (cnt == 0)
			System.out.println("ÀÚ·á°¡ ¾ø½À´Ï´Ù.");

		System.out.println(aList1);

	}
}
