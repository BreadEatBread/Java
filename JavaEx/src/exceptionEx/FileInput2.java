package exceptionEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\text1.txt");
		} catch (FileNotFoundException fnfe) { // FileNotFoundException Error
			System.out.println("������ ������ �����ϴ�!!");
			return; // finally�� ���� ����
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				System.out.println("���ҽ��� �����߽��ϴ�!");
			}
		}
		System.out.println("������ ������ �ֽ��ϴ�!!");
	}
}
