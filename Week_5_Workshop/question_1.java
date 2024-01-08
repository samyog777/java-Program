package Week_5_Workshop;

public class question_1 {

	public static void main(String[] args) {
//		Animal ani = new Animal()?=;
		Dog dd = new Dog();
	}
}

class Animal{
	String name = "SAM";
	int age = 4;
	
	Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Name: "+name+"\nAge:"+age);
	}
}
class Dog extends Animal{
	String breed = "PitBull";
	Dog(){
		System.out.println("Breed: "+breed);
	}
}