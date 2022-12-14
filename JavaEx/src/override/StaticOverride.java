package override;

class Father1 {
	static void method1() {
		System.out.println("Father1 클래스의 static method1()");
	}
	protected void method2() {
		System.out.println("Father1 클래스의 non static method2()");
	}
}

class Child1 extends Father1{
	static void method1() {
		System.out.println("Child1 클래스의 static method1()");
	}
	protected void method2() {
		System.out.println("Child1 클래스의 non static method2()");
	}
}

public class StaticOverride {
	public static void main(String[] args) {
		Father1 obj1 = new Father1();
		obj1.method1();
		obj1.method2();
		Father1 obj2 = new Child1();
		obj2.method1();
		obj2.method2();
	}

}
