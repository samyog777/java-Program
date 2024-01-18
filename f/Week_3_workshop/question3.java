package Week_3_workshop;
import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner Scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number: ");
			n = Scan.nextInt();
		}
		while (n != 0);
		System.out.println("you win!!");
		
		Scan.close();
	}
}
