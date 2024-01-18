package Tutorial_6;

public class interface_3 {

	public static void main(String[] args) {
		NepalBank3 b = new NepalBank4();
		b.deposite1();
		b.withdraw1();
		b.specificToNepal();
	}
}


interface Bank2{
	void deposite1();
	
	void withdraw1();
}

interface NepalBank3 extends Bank2{
    void specificToNepal();
}

class NepalBank4 implements NepalBank3{
	public void deposite1() {
		System.out.println("deposite form Nepal bank!");
	}
	
	public void withdraw1() {
		System.out.println("Withdraw form Nepal bank!");
	}
	
	public void specificToNepal() {
		System.out.println("Form Nepal bank4!");
	}
}