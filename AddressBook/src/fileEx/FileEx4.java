package fileEx;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import arrayListEx.Address;

public class FileEx4 {
	public static void main(String[] args) throws Exception {
		ArrayList<Address> read_data = null;
		FileInputStream fis = new FileInputStream("c:/filetest/newdata1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		read_data = (ArrayList<Address>) ois.readObject(); // ���Ͽ��� ArrayList �б�
		ois.close();
		System.out.println(read_data.getClass());
		System.out.println("ArrayList ��ü ������ ����� ������ �о����ϴ�.");
	}
}
