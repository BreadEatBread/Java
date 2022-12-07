package classEx;

public class ManEx {
	public static void main(String[] args) {
//		Man man = new Man();
//		man.setAge(40);
//		man.setChild(3);
//		man.setMarried(true);
//		man.setName("제임스");
//		System.out.println("이름: " + man.getName());
//		System.out.println("나이: " + man.getAge());
//		System.out.println("결혼여부: " + man.isMarried());
//		System.out.println("자녀수: " + man.getChild());
//		man.setAge(30,"김정웅",false,0);
//		System.out.println("이름: " + man.getName());
//		System.out.println("나이: " + man.getAge());
//		System.out.println("결혼여부: " + man.isMarried());
//		System.out.println("자녀수: " + man.getChild());
		Man man1 = new Man();
		System.out.println("이름: " + man1.getName());
		System.out.println("나이: " + man1.getAge());
		System.out.println("결혼여부: " + man1.isMarried());
		System.out.println("자녀수: " + man1.getChild());
		Man man2 = new Man(60);
		System.out.println("이름: " + man2.getName());
		System.out.println("나이: " + man2.getAge());
		System.out.println("결혼여부: " + man2.isMarried());
		System.out.println("자녀수: " + man2.getChild());
		Man man3 = new Man(50,"홍길동");
		System.out.println("이름: " + man3.getName());
		System.out.println("나이: " + man3.getAge());
		System.out.println("결혼여부: " + man3.isMarried());
		System.out.println("자녀수: " + man3.getChild());
	}
}
