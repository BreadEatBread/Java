package fileEx;
import java.io.File;
public class FileEx1 {
	public static void main(String[] args) throws Exception {
		File tempDir = new File("c:/filetest"); // c:/filetest 폴더 확인
		if(!tempDir.exists()) tempDir.mkdir(); // 없으면 폴더 만들기
		System.out.println(tempDir.exists());
		File newFile = new File("c:/filetest/newTest.txt");
		if(!newFile.exists()) newFile.createNewFile(); // 없으면 파일 만들기
		System.out.println(newFile.exists());
	}
}
