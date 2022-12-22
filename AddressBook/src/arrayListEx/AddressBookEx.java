package arrayListEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import externalEx.ProgramInfo;

public class AddressBookEx {
	public static void main(String[] args) throws Exception {
		ProgramInfo.print("�ּҷ� ���α׷�", "������", 1.0);
		ArrayList<Address> addressBook = new ArrayList<Address>();
		addressBook = readfile();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1:��� 2:��ȸ 3:�Ǻ���ȸ 4:���� x:���� ==> ");
			String code = sc.next();
			switch (code) {
			case "1":
				input(sc, addressBook);
				break;
			case "2":
				searchAll(addressBook);
				break;
			case "3":
				searchName(sc, addressBook);
				break;
			case "4":
				delete(sc, addressBook);
				break;
			case "x":
				break;
			default:
				System.out.println("�Է� ������ �߸� �Է��ϼ̽��ϴ�!!!");
			}
			if (code.equals("x")) {
				writefile(addressBook);
				System.out.println("*** ���α׷��� �̿��� �ּż� �����մϴ�. ***");
				ProgramInfo.print("�ּҷ� ���α׷�", "������", 1.0);
				break;
			}
		}
	}

	private static void writefile(ArrayList<Address> addressBook) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/filetest/newdata1.txt"));
		oos.writeObject(addressBook);
		oos.close();
	}

	private static ArrayList<Address> readfile() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/filetest/newdata1.txt"));
		ArrayList<Address> read_data = null;
		read_data = (ArrayList<Address>) ois.readObject();
		ois.close();
		return read_data;
	}

	private static void delete(Scanner sc, ArrayList<Address> addressBook) {
		System.out.println("*** �ּ� ���� ó�� ***");
		if (addressBook.size() <= 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�.");
		} else {
			System.out.println("�̸� �Է�: ");
			String name = sc.next();
			int cnt = 0;
			System.out.println("** ��� ��ȣ ���� **");
			for (int i = 0; i < addressBook.size(); i++) {
				if (name.equals(addressBook.get(i).getName())) {
					cnt++;
					System.out.println(i + ") " + name + " :" + addressBook.get(i).getPhone() + " " + addressBook.get(i).getEmail());
				}
			}
			if (cnt == 0)
				System.out.println("�Է��Ͻ� " + name + " ��(��) ��ϵ��� �ʾҽ��ϴ�.");
			else {
				System.out.println("������ ��Ϲ�ȣ #) �Է�: ");
				String num = sc.next();
				System.out.println("���� �����Ͻðڽ��ϱ�?(y/n)");
				String check = sc.next();
				if (check.equals("y")) {
					addressBook.remove(Integer.parseInt(num));
					System.out.println("���� �Ǿ����ϴ�...");
				} else
					System.out.println("��� �Ǿ����ϴ�...");
			}
		}
	}

	private static void searchName(Scanner sc, ArrayList<Address> addressBook) {
		System.out.println("*** �̸����� �ּ� ��ȸ ***");
		if (addressBook.size() <= 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�.");
		} else {
			System.out.println("�̸� �Է�: ");
			String name = sc.next();
			int cnt = 0;
			for (int i = 0; i < addressBook.size(); i++) {
				if (name.equals(addressBook.get(i).getName())) {
					System.out.println((i + 1) + ") " + name + " : " + addressBook.get(i).getPhone() + " " + addressBook.get(i).getEmail());
					cnt++;
				}
			}
			if (cnt == 0)
				System.out.println("�Է��Ͻ� " + name + " ��(��) ��ϵ��� �ʾҽ��ϴ�.");
		}
	}

	private static void searchAll(ArrayList<Address> addressBook) {
		System.out.println("*** ��ü �ּ� ��ȸ ***");
		if (addressBook.size() <= 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�.");
		}
		for (int i = 0; i < addressBook.size(); i++) {
			String a_name = addressBook.get(i).getName();
			String a_phone = addressBook.get(i).getPhone();
			String a_email = addressBook.get(i).getEmail();
			System.out.println((i + 1) + ") " + a_name + " " + a_phone + " " + a_email);
		}
	}

	private static void input(Scanner sc, ArrayList<Address> addressBook) {
		System.out.println("*** �ּ� ��� ó�� ***");
		System.out.println("�̸� �Է�: ");
		String name = sc.next();
		System.out.println("��ȭ��ȣ �Է�: ");
		String phone = sc.next();
		System.out.println("�̸��� �Է�: ");
		String email = sc.next();
		addressBook.add(new Address(name, phone, email));
		int size = addressBook.size() - 1;
		String a_name = addressBook.get(size).getName();
		String a_phone = addressBook.get(size).getPhone();
		String a_email = addressBook.get(size).getEmail();
		System.out.println("��� �Ϸ� ==> " + a_name + " " + a_phone + " " + a_email);
	}

}
