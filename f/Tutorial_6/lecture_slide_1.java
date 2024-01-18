package Tutorial_6;

public class lecture_slide_1 {

	public static void main(String[] args) {
		Bike b = new Honda();
		b.changeGear();
		b.run();
	}

}
abstract class Bike{
	Bike() {
		System.out.println("Bike constructor is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");
	}
}

class Honda extends Bike{
	void run() {
		System.out.println("Running safely");
	}
}

//
//class TestAbstraction{
//	public static void main(String args[]) {
//		Bike obj = new Honda();
//		obj.run();
//		obj.changeGear();
//	}
//}
//
