package classEx;

class DefaultA {
	int m;

	void work() {
		System.out.println(m);
	}
}

class DefaultB {
	int m;

	void work() {
		System.out.println(m);
	}

	DefaultB() {
	}
}

class DefaultC {
	int m;

	void work() {
		System.out.println(m);
	}

	DefaultC(int a) {
		m = a;
	}

	DefaultC() {
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		DefaultA a = new DefaultA();
		DefaultB b = new DefaultB();
		DefaultC d = new DefaultC();
		DefaultC c = new DefaultC(3);

		a.work();
		b.work();
		c.work();
		d.work();
	}

}
