package dataType;
import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		System.out.print("정수 입력: ");
		int iNum = sc.nextInt();		
		System.out.print("실수 입력: ");
		double dNum = sc.nextDouble();
		sc.nextLine();		
		System.out.print("단어/문장 입력: ");
		String sInput = sc.nextLine();		
		sc.close();
		System.out.println("-----------------------");
		System.out.println("입력한 정수는 "+iNum+" 입니다");
		System.out.println("입력한 실수는 "+dNum+" 입니다");
		System.out.println("입력한 단어/문장은 "+sInput+" 입니다");
	}
}
