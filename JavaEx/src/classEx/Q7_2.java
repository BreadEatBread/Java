package classEx;

class Q7_2A {
	void print() {
		System.out.println("�Է°��� �����ϴ�.");
	}

	void print(int a) {
		System.out.println("���� �Է°� : " + a);
	}

	void print(double a) {
		System.out.println("�Ǽ� �Է°� : " + a);
	}

	void print(String a) {
		System.out.println("���ڿ� �Է°� : " + a);
	}
}

public class Q7_2 {
	public static void main(String[] args) {
		Q7_2A a = new Q7_2A();
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("�ȳ�");
	}
}
