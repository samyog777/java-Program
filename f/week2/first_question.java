package week2;
import java.util.Scanner;

public class first_question {

	public static void main(String[] args) {
		int n;
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		n = Scan.nextInt();
		
		if (n < 0) {
			System.out.println("This is a negative number!");
		}
		
		else if (n > 0) {
			System.out.println("This is a positive number!");
		}
		else {
			System.out.println("This is zero! ");
		}
		Scan.close();
	}

}
