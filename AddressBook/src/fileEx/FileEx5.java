package fileEx;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import arrayListEx.Address;

public class FileEx5 {
	public static void main(String[] args) throws Exception {
		ArrayList addressBook = new ArrayList<Address>();
		FileOutputStream fos = new FileOutputStream("c:/filetest/newdata1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(addressBook); // 파일에 ArrayList 저장
		oos.close();
		System.out.println(addressBook.getClass());
		System.out.println("ArrayList 객체 구조가 저장된 파일을 만들었습니다.");
	}
}
