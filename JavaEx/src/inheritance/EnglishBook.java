package inheritance;

public class EnglishBook extends Book {
	int code = 2000;

	public EnglishBook(String title, int price) {
		super(title, price);
	}

	public void printPrice() {
		super.printPrice();
		System.out.println("");
		System.out.println("code:\t\t" + code);
		System.out.println("this.code:\t" + this.code);
		System.out.println("super.code:\t" + super.code);
		System.out.println("");
		System.out.println("price:\t\t" + price);
		System.out.println("this.price:\t" + this.price);
		System.out.println("super.price:\t" + super.price);
	}

}
