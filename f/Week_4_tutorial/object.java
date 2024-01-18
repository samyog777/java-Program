package Week_4_tutorial;


class dog {
	String breed;
	int age;
	String color;
//	
//	dog() {
//		System.out.println("The details of dog is: ");
//	}
//	
	dog(String b, int a, String c) {
		System.out.println("Breed: "+b);
		System.out.println("Age: "+a);
		System.out.println("Color: "+c);
	}
}

public class object {

	public static void main(String[] args) {
//		dog dog = new dog();
//		dog.breed = "Pit bull";
//		dog.age = 4;
//		dog.color= "brown";
//		
//		dog.PrintDetails();
//		
//		dog s2 = new dog();
//		s2.color = "black";
//		dog d = new dog();
		dog c = new dog("Pitbull",6,"black");
		
	}

}
