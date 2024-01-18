package Week_2_workshop;
import java.util.Scanner;

public class question_11 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		
		System.out.println("Enter first String: ");
		String first = Scan.nextLine();
		
		System.out.println("Enter second String: ");
		String second = Scan.nextLine();
		
		System.out.println("The uppercase of " + first + " is: " + first.toUpperCase());
		System.out.println("The lowercase of " + second + " is " + second.toLowerCase());
	}

}
