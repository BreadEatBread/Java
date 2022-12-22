package GenericEx;

class Goods<T> {
	private T t;

	public T get() {
		System.out.println(Goods.class + " °´Ã¼ »ý¼º");
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class UsingGeneric {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();

		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();

		Goods<Apple> goods3 = new Goods<>();
		goods1.set(new Apple());
//		Pencil apple1 = goods3.get();
	}
}
