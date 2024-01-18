package Week_2_workshop;
import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = Scan.nextInt();
		
		if (age >= 18) {
			System.out.println("Your are old");
		}
		else {
			System.out.println("Your are young");
		}
	}

}
