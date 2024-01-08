package Week_5_Workshop;
import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter radius to calculate perimeter and area of circle: ");
		float r = Scan.nextFloat();
		System.out.println("The area for radius "+r);
		Scan.close();
		
		Circle c = new Circle(r);
		c.getPerimeter(r);
		c.getarea(r);
	}
}

class Shape{
	float pi = 22/7;
	float r;
	
}

class Circle extends Shape{
	Circle(float r) {
		this.r = r;
	}
	
	void getPerimeter(float r) {
		this.r = r;
		float perimeter = 2*pi*r;
		System.out.println("The perimeter is: "+perimeter);
		
	}
	
	void getarea(float r) {
		this.r=r;
		float area = pi*r*r;
		System.out.println("The area is: "+area);
	}
	
}
