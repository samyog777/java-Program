package Tutorial_5;

public class Animal {

	public static void main(String[] args) {
		Animal1 a = new Animal1();
		Animal1 b = new Animal1();
		Dog d = new Dog();
		d.display();
	}
}

class Animal1{
	String Name="Wolf";
	String Sound="HOOW";
	
	Animal1() {
		System.out.println("I am a animal class Constructor");
	}
	
	Animal1(String n, String s) {
		this.Name = n;
		this.Sound = s;
//		System.out.println("Name of Dog: "+n+" And "+"Sound: "+s);
	}
}

class Dog extends Animal1{
	void display() {
		System.out.println("I am a dog class method!");
		System.out.println("Name: "+ Name + " " +"Sound: "+Sound);
	}
}
