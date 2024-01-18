package Week_5_Workshop;

public class question_3 {

	public static void main(String[] args) {
		Anima1 a = new Do1("Tomy");
		
	}

}

class Anima1{
	Anima1(String name) {
		System.out.println("This is constructor under Animal class!!");
	}
}

class Do1 extends Anima1{
	Do1(String name){
		super(name);
		System.out.println("Tis is new constructor under Dog class!");
	}
}
