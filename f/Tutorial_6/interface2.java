package Tutorial_6;

public class interface2 {

	public static void main(String[] args) {
		Bank1 b  = new NepalBank();
		b.deposite();
		b.withdraw();
	}

}

interface Bank1{
	void deposite();
	
	void withdraw();
}

class NepalBank implements Bank1{
	@Override
	public void deposite() {
		System.out.println("deposite form nepal bank!");
	}
	@Override
	public void withdraw() {
		System.out.println("Model form Nepal bank!!");
	}
}
