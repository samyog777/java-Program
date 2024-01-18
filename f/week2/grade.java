package week2;
import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		float percentage;
		
		Scanner Scan = new Scanner (System.in);
		
		System.out.println("Enter your grade percentage: ");
		percentage = Scan.nextFloat();
		
		if (percentage > 100) {
			System.out.println("Invalid input!!");
		}
		else if (percentage >= 70 && percentage <= 100) {
			System.out.println("Your grade is A");
		}
		else if (percentage > 70 && percentage <= 60) {
			System.out.println("Your grade is B");
		}
		else if (percentage > 60 && percentage <= 50) {
			System.out.println("your grade is C");
		}
		else if (percentage > 50 && percentage <=40) {
			System.out.println("Your grade is D");
		}
		else {
			System.out.println("Your Fail the grade");
		}
		
		Scan.close();
	}

}
