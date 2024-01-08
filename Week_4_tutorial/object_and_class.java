package Week_4_tutorial;

class Object {
	String name;
	int age;
	double height;
	
//	void Details() {
	Object(String n, int a, double h){
		System.out.println("Name: "+n);
		System.out.println("Age: "+a);
		System.out.println("Height: "+h);
	}
	
}
//public class object_and_class {
//	public void main(String[] args) {
//		Object o = new Object ();
//		o.name = "Samyog";
//		o.age = 18;
//		o.height = 5.9;
//		o.Details();
//	}
//
//}

public class object_and_class {
	public static void main(String[] args) {
		Object o = new Object("Samyog",18,5.9);
	}
}
