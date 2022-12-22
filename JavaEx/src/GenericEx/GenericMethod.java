package GenericEx;

class GenericMethods {
	public <T> T method1(T t) {
		return t;
	}

	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}

	public <T1, T2> void method3(T1 k, T2 v) {
		System.out.println(k + ":" + v);
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		String str1 = gm.<String>method1("¾È³ç");
		String str2 = gm.method1("¾È³ç");
		int num = gm.<Integer>method1(100);
		System.out.println(str1 + ":" + num + ":" + str2);

		boolean boo1 = gm.<Double>method2(2.2, 2.2);
		boolean boo2 = gm.method2(2, 25);
		System.out.println(boo1 + ":" + boo2);

		gm.<String, Integer>method3("±¹¾î", 100);
		gm.method3(100, "¿µ¾î");
	}
}
