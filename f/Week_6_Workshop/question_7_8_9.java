package Week_6_Workshop;

public class question_7_8_9 {

	public static void main(String[] args) {
		Cow a = new Cow();
		a.display();
	}

}

interface Animal{
	String eat();
	
	String walk();
}

interface printable{
	void display();
}

class Cow implements Animal,printable{
	@Override
	public String eat() {
		String eat = "cow eats";
		return eat;
	}
	
	@Override
	public String walk() {
		String walk = "cow walks";
		return walk;
	}
	
	@Override
	public void display() {
		System.out.println("For eat: " + this.eat());
		System.out.println("For walk: " + this.walk());
	}
}