package exceptionEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\text.txt");
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
