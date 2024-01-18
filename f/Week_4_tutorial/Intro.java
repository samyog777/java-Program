package Week_4_tutorial;

class student {
	String name;
	int age;
	String course;
	public void PrintDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
	}
}

public class Intro {
	
	public static void main(String[] args) {
		student s1 = new student();
		s1.name = "Ram";
		s1.age = 23;
		s1.course = "BCS";
		
		s1.PrintDetails();
		
		student s2 = new student();
		s2.name = "Samyog";
		
	}
}
