package Tutorial_6;

public class tutorial_1 {

	public static void main(String[] args) {
		Bank b = new sum1();
		Bank c = new sum2();
		b.deposit();
		c.deposit();
	}

}

abstract class Bank{
	void deposit() {
		System.out.println("Abstract class Bank!!");
	}
}

class sum1 extends Bank {
	void deposit() {
		super.deposit();
		System.out.println("This is first subclass");
	}
}

class sum2 extends Bank{
	void deposit() {
		System.out.println("This is second subclass");
	}
}