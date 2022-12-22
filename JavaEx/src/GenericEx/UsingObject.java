package GenericEx;

class Apple {
};

class Pencil {
};

class Goods3 extends Object {
	private Object object = new Object();

	public Object getObject() {
		System.out.println(Object.class + " °´Ã¼ »ý¼º");
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

public class UsingObject {
	public static void main(String[] args) {
		Goods3 goods1 = new Goods3();
		goods1.setObject(new Apple());
		Apple apple = (Apple) goods1.getObject();

		Goods3 goods2 = new Goods3();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil) goods2.getObject();

		Goods3 goods3 = new Goods3();
		goods3.setObject(new Apple());
		Pencil pencil2 = (Pencil) goods3.getObject();
	}
}
