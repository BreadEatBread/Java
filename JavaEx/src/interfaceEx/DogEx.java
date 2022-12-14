package interfaceEx;

abstract interface Pet {
	public abstract void makeSound();
}

class Dog implements Pet {
	public void makeSound() {
		System.out.println("港港港!");
	}
}
class Cat implements Pet{
	public void makeSound() {
		System.out.println("具克具克!");
	}
}

public class DogEx {
	public static void main(String[] args) {
		Pet p = new Dog();
		p.makeSound();
		Pet p1 = new Cat();
		p1.makeSound();
	}
}
