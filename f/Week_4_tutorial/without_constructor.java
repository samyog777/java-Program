package Week_4_tutorial;

class Something{
	String What;
	int number;
	double it;
	
	void Thing() {
		System.out.println("String: "+What);
		System.out.println("Int: "+number);
		System.out.println("Double: "+ it);
	}
}
public class without_constructor {

	public static void main(String[] args) {
		Something some = new Something();
		some.What = "What";
		some.number = 45;
		some.it = 21.21;
		some.Thing();
	}

}
