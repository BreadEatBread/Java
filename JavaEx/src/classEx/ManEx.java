package classEx;

public class ManEx {
	public static void main(String[] args) {
		Man man = new Man();
		man.setAge(40);
		man.setChild(3);
		man.setMarried(true);
		man.setName("���ӽ�");
		System.out.println("�̸�: " + man.getName());
		System.out.println("����: " + man.getAge());
		System.out.println("��ȥ����: " + man.isMarried());
		System.out.println("�ڳ��: " + man.getChild());
	}
}
