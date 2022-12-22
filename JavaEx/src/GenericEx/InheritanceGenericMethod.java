package GenericEx;

class Parent {
	<T> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent {
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.<Integer>print(10);

		Child c = new Child();
		c.<Double>print(5.5);
		c.print(5.8);
		c.print("Number 클래스 상속을 없앴습니다!");
	}
}
