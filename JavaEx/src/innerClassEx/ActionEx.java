package innerClassEx;

abstract class Action {
	public abstract void exec();
}

//class MyAction extends Action {
//	@Override
//	public void exec() {
//		System.out.println("실행");
//	}
//}

public class ActionEx {
	public static void main(String[] args) {
		Action action = new Action() {
			public void exec() {
				System.out.println("실행");
			}
		};
		action.exec();
	}
}
