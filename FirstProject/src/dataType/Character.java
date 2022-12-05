package dataType;

public class Character {
	public static void main(String[] args) {
		char ch1 = '°¢';
		char ch2 = '\uac01';
		char ch3 = '\uAE40';
		char ch4 = '\uc815';
		char ch5 = '\uc6c5';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(""+ch3+ch4+ch5);
	}

}
