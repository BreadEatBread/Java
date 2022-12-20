package fileEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileEx2 {
	public static void main(String[] args) throws Exception {
		File infile = new File("c:/filetest/newtest.txt"); // c:/filetest 폴더 확인
		InputStream is1 = new FileInputStream(infile);
		int data;
		while ((data = is1.read()) != -1) {
			System.out.println((char)data);
		}
		is1.close();
	}
}
