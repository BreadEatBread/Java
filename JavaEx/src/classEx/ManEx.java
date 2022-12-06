package classEx;

public class ManEx {
	public static void main(String[] args) {
		Man man = new Man();
		man.setAge(40);
		man.setChild(3);
		man.setMarried(true);
		man.setName("제임스");
		System.out.println("이름: " + man.getName());
		System.out.println("나이: " + man.getAge());
		System.out.println("결혼여부: " + man.isMarried());
		System.out.println("자녀수: " + man.getChild());
	}
}
