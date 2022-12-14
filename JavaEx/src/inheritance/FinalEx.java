package inheritance;

class FinalMethod {
	public void display() {
		System.out.println("This is a final method.");
	}
}

public class FinalEx extends FinalMethod {
	public final void display() {
		super.display();
		System.out.println("The final method is overridden.");
	}

	public static void main(String[] args) {
		FinalEx obj = new FinalEx();
		obj.display();
	}
}
