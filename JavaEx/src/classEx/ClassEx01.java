package classEx;

class Name {
	String name = "È«±æµ¿";

	void namePrint() {
		System.out.println("ÇÁ·Î±×·¥ °³¹ßÀÚ Á¤º¸: " + name);
	}
}

public class ClassEx01 {
	public static void main(String[] args) {
		Name n = new Name();

		n.name = "±èÁ¤¿õ";
		System.out.println(n.name);
//		n.name = "±èÁ¤¿õ";
		n.namePrint();
	}
}
