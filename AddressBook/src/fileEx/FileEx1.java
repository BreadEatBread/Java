package fileEx;
import java.io.File;
public class FileEx1 {
	public static void main(String[] args) throws Exception {
		File tempDir = new File("c:/filetest"); // c:/filetest ���� Ȯ��
		if(!tempDir.exists()) tempDir.mkdir(); // ������ ���� �����
		System.out.println(tempDir.exists());
		File newFile = new File("c:/filetest/newTest.txt");
		if(!newFile.exists()) newFile.createNewFile(); // ������ ���� �����
		System.out.println(newFile.exists());
	}
}
