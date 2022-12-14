package inheritance;

abstract class Bike {
	abstract void brake();
}

class SportsBike extends Bike {
	public void brake() {
		System.out.println("SportsBike Brake");
	}
}

class MountainBike extends Bike {
	public void brake() {
		System.out.println("MountainBike Brake");
	}
}

class MotorBike extends Bike {
	public void brake() {
		System.out.println("MotorBike Brake");
	}
}

public class BikeEx {
	public static void main(String[] args) {
		MountainBike m1 = new MountainBike();
		m1.brake();
		SportsBike s1 = new SportsBike();
		s1.brake();
		MotorBike m2 = new MotorBike();
		m2.brake();
	}
}
