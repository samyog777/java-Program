package Week_4_tutorial;

class construstion {
	String color;
	String model;
	double price;
	
	construstion() {
		System.out.println("hello I am a car!!");
	}
	construstion (String c, String m, double p) {
		System.out.println("Color is: "+ c);
		System.out.println("Model is: "+ m);
		System.out.println("Price is: "+ p);
	}
}

public class constructor {

	public static void main(String[] args) {
	construstion c1 = new construstion();
	construstion c2 = new construstion("Blue", "gg", 2.33);

	}
}
