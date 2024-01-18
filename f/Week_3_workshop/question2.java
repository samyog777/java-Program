package Week_3_workshop;
import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, factorial = 1;
		System.out.println("Enter a number to find its factorial: ");
		Scanner Scan = new Scanner (System.in);
		
		n = Scan.nextInt();
		
		while (n > 0) {
			factorial *= n;
			n--;
		}
		System.out.println("The factorial is " + factorial);
		Scan.close();
	}

}
