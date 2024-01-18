package Exams;

public class Abstraction_oop {
	public static void main(String[] args) {
		Bank b= new A();
		b.getBalence();
		Bank b1 = new B();
		b1.getBalence();
		Bank b3 = new C();
		b3.getBalence();

	}
}

abstract class Bank{
	abstract void getBalence();
}

class A extends Bank{
	@Override
	void getBalence() {
		System.out.println("$50");
	}
}

class B extends Bank{
	void getBalence() {
		System.out.println("$100");
	}
}

class C extends Bank{
	void getBalence() {
		System.out.println("$150");
	}
}
