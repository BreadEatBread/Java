package arrayListEx;

import externalEx.ProgramInfo;
import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ProgramInfo.print("ArrayList�ǽ�", "������", 1.0);
		ArrayList<String> aList1 = new ArrayList<String>();

		aList1.add("������");
		aList1.add("ȫ�浿");
		aList1.add("������");

		System.out.println(aList1);

		System.out.println(aList1.get(0));

		int cnt = 0;
		for (int i = 0; i < aList1.size(); i++) {
			if (aList1.get(i) == "������") {
				cnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		if (cnt == 0)
			System.out.println("�ڷᰡ �����ϴ�.");

		aList1.set(0, "������");
		System.out.println(aList1);

		aList1.remove("������");
		System.out.println(aList1);

		aList1.add("������");
		aList1.add("������");
		System.out.println(aList1);
		aList1.remove("������");
		
		
		for (int i = 0; i < aList1.size(); i++) {
			if (aList1.get(i) == "������") {
				cnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		if (cnt == 0)
			System.out.println("�ڷᰡ �����ϴ�.");

		System.out.println(aList1);

	}
}
