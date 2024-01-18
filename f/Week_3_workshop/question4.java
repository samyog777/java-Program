package Week_3_workshop;
import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		System.out.println("Enter number of rows in star pyramid: ");
		
		int rows = Scan.nextInt(); 

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	        Scan.close();
	}

}