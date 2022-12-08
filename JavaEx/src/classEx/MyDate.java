package classEx;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("월 입력 오류입니다.");
			System.out.close();
		} else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 29) {
				System.out.println("일자 오류입니다!");
				System.out.close();
			} else {
				this.day = day;
			}
		}
		this.day = day;
	}
}
