package classEx;

public class VariableEx {
	static int sval = 100; // 클래스변수 = 스태틱변수
	int ival = 200; // 필드 = 인스턴스변수 = 객체형변수 = 멤버변수

	public static void main(String[] args) {
		System.out.println("sval: " + sval);
//		System.out.println("ival: " + ival);

		VariableEx ex1 = new VariableEx();
		VariableEx ex2 = new VariableEx();
		ex1.ival = 300;
		System.out.println("ex1 ival: " + ex1.ival);
		System.out.println("ex2 ival: " + ex2.ival);
		int ival = 400; // 지역변수 = 로컬변수
		System.out.println("ival: " + ival);
	}
}
