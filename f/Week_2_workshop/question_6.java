package Week_2_workshop;
import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter a nunber to check if it is odd or even: ");
		int num = Scan.nextInt();
		
		if (num % 2 == 1) {
			System.out.println("It is odd");
		}
		else {
			System.out.println("It is even");
		}
		Scan.close();
	}

}
