package GenericEx;

class KeyValue<A, B> {
	private A var1;
	private B var2;

	public A getVar1() {
		return var1;
	}

	public void setVar1(A var1) {
		this.var1 = var1;
	}

	public B getVar2() {
		return var2;
	}

	public void setVar2(B var2) {
		this.var2 = var2;
	}

}

public class TwoGeneric {
	public static void main(String[] args) {
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setVar1("사과");
		kv1.setVar2(10000);
		String name = kv1.getVar1();
		int price = kv1.getVar2();
		System.out.println("이름: " + name + " 가격: " + price);

		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setVar1(100);
		kv2.setVar2("제네시스");
		int no = kv2.getVar1();
		String car_name = kv2.getVar2();
		System.out.println("제품번호: " + no + " 차종: " + car_name);

		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setVar1("첫 번째 변수만 사용");
		String message = kv3.getVar1();
		System.out.println("첫 번째 변수값: " + message);
	}
}
