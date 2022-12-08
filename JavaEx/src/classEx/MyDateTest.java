package classEx;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setMonth(12);
		date.setDay(28);
		date.setYear(2022);
		System.out.println(date.getYear() + "³â" + date.getMonth() + "¿ù" + date.getDay() + "ÀÏ");
	}
}
