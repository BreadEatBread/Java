package fileEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileEx3 {
	public static void main(String[] args) throws Exception {
		File outfile = new File("c:/filetest/newtest.txt");
		OutputStream os1 = new FileOutputStream(outfile);
		os1.write('J');
		os1.write('a');
		os1.write('v');
		os1.write('a');
		os1.flush();
		os1.close();
	}
}
