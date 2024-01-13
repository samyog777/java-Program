package Tutorial_5;

public class SuperKey {

	public static void main(String[] args) {
		Dogs c = new Dogs();
		Dogs d = new Dogs("tommy");
	}
}

class Animals{
	Animals() {
		System.out.println("This is constructor of Animal");
	}
	Animals(String Name) {
		System.out.println("Name: "+Name);
	}
}


class Dogs extends Animals{
	Dogs() {
		System.out.println("This is constructor of dog!");
	}
	Dogs(String Name) {
		super(Name);
		System.out.println("This is constructor with parameter!"+Name);
	}
}
