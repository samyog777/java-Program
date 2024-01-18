package hello;
import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		
		System.out.println("Enter your first number: ");
		float a = Scan.nextInt();
		
		System.out.println("Enter your second number: ");
		float b = Scan.nextInt();
		
		float add = a + b;
		float sub = a - b;
		float multi = a * b;
		float divide = a / b;
		
		System.out.println("The addition of of your number is " + add);
		System.out.println("The subtraction of your number is " + sub);
		System.out.println("The multiplication of your number is " + multi);
		System.out.println("The division of your number is: " + divide);

	}

}
