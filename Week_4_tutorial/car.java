package Week_4_tutorial;

class Car {
	String name;
	double version;
	String price;
	
	void PrintDetails() {
		System.out.println("Name: " + name);
		System.out.println("Version: " + version);
		System.out.println("Price: " + price);
	}
}


public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.name = "Toyato";
		c1.version = 3.4;
		c1.price = "3cr";
		c1.PrintDetails();
	}

}

