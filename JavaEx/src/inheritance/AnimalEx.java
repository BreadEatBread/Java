package inheritance;

import externalEx.ProgramInfo;

abstract class Animal {
	abstract void makeSound();
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("¸Û¸Û¸Û!!");
	}
	public void display() {
		System.out.println("I am dog");
	}

	public void printMessage() {
		super.display();
		display();
	}
}

public class AnimalEx {
	public static void main(String[] args) {
		ProgramInfo.print("super ½Ç½À", "±èÁ¤¿õ", 2.0);
		Dog dog1 = new Dog();
		dog1.printMessage();
		dog1.makeSound();
	}
}
