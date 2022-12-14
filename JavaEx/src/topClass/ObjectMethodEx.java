package topClass;

import externalEx.ProgramInfo;

class ObjectA {
	int a = 3;
	int b = 4;
}

class ObjectB {
	int a = 3;
	int b = 4;

	public String toString() {
		return "필드값(a,b) = " + a + " " + b;
	}
}

public class ObjectMethodEx {
	public static void main(String[] args) {
		ProgramInfo.print("Object 클래스 실습", "김정웅", 1.0);
		ObjectA a = new ObjectA();
		ObjectB b = new ObjectB();

		System.out.println("ObjectA :" + a.toString());
		System.out.println("\t:" + a);
		System.out.printf("\t:%x\n", a.hashCode());
		System.out.println("ObjectB :" + b.toString());
		System.out.println("\t:" + b);
		System.out.printf("\t:%x\n", b.hashCode());
	}
}
