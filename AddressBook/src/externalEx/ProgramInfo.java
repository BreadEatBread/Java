package externalEx;

public class ProgramInfo {
//	String programName;
//	String developerName;
//	String versionName;

//	public ProgramInfo(String programName, String developerName, String versionName) {
//		this.programName = programName;
//		this.developerName = developerName;
//		this.versionName = versionName;
//	}

	public static void print(String programName, String developerName, Double versionName) {
		System.out.println("+".repeat(30));
		System.out.println("+    ���α׷� ��:" + programName + " ".repeat(18 - programName.length()) + "+");
		System.out.println("+    ������ �̸�:" + developerName + " ".repeat(18 - developerName.length()) + "+");
		System.out.println("+    ���� ����:" + versionName + " ".repeat(18 - versionName.toString().length()) + "+");
		System.out.println("+".repeat(30));
	}
}
