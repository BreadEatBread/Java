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
			System.out.println("선택한 파일이 없습니다!!");
			return; // finally를 거쳐 종료
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				System.out.println("리소스를 해제했습니다!");
			}
		}
		System.out.println("선택한 파일이 있습니다!!");
	}
}
