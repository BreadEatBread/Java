package loopEx;

public class BasicLoop {
	public static void main(String[] args) {
		long num = 1, sum = 0L;
		for (num = 1; num <= 100000; num++) {			
			sum += num;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");
	}
}
