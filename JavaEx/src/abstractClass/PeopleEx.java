package abstractClass;
abstract class People{
	abstract void greeting();
//	void info() {
//	}
}
class Korean extends People{
	void greeting() {
		System.out.println("æ»≥Á«œººø‰!");
	}
}
class American extends People{
	void greeting() {
		System.out.println("Hello!");
	}
}
public class PeopleEx {
	public static void main(String[] args) {
		Korean kr = new Korean();
		kr.greeting();
		American am = new American();
		am.greeting();
	}
}
