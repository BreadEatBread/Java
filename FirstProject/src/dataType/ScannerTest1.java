package dataType;
import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		System.out.print("���� �Է�: ");
		int iNum = sc.nextInt();		
		System.out.print("�Ǽ� �Է�: ");
		double dNum = sc.nextDouble();
		sc.nextLine();		
		System.out.print("�ܾ�/���� �Է�: ");
		String sInput = sc.nextLine();		
		sc.close();
		System.out.println("-----------------------");
		System.out.println("�Է��� ������ "+iNum+" �Դϴ�");
		System.out.println("�Է��� �Ǽ��� "+dNum+" �Դϴ�");
		System.out.println("�Է��� �ܾ�/������ "+sInput+" �Դϴ�");
	}
}
